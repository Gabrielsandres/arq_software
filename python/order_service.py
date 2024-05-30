from flask import Flask, request, jsonify
import requests

app = Flask(__name__)

orders = {
    1: {'user_id': 1, 'product': 'Laptop', 'quantity': 1},
    2: {'user_id': 2, 'product': 'Phone', 'quantity': 2}
}

USER_SERVICE_URL = 'http://localhost:5000/user/'

@app.route('/orders', methods=['GET'])
def get_orders():
    return jsonify(orders)

@app.route('/order/<int:order_id>', methods=['GET'])
def get_order(order_id):
    order = orders.get(order_id)
    if order:
        user_response = requests.get(USER_SERVICE_URL + str(order['user_id']))
        if user_response.status_code == 200:
            user_info = user_response.json()
            order['user'] = user_info
            return jsonify(order)
        else:
            return jsonify({'error': 'User not found in user service'}), 404
    else:
        return jsonify({'error': 'Order not found'}), 404

if __name__ == '__main__':
    app.run(port=5001)
