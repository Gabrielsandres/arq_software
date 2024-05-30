from flask import Flask, request, jsonify

app = Flask(__name__)

users = {
    1: {'name': 'Alice', 'email': 'alice@example.com'},
    2: {'name': 'Bob', 'email': 'bob@example.com'}
}

@app.route('/users', methods=['GET'])
def get_users():
    return jsonify(users)

@app.route('/user/<int:user_id>', methods=['GET'])
def get_user(user_id):
    user = users.get(user_id)
    if user:
        return jsonify(user)
    else:
        return jsonify({'error': 'User not found'}), 404

if __name__ == '__main__':
    app.run(port=5000)
