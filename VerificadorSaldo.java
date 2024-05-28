public class VerificadorSaldo {
    private double saldoConta = 1000.00;

    public double getSaldoConta() { return saldoConta; }

    public void subtrairSaldo(double valor) {
        saldoConta -= valor;
    }

    public void somarSaldo(double valor) {
        saldoConta += valor;
    }

    public boolean sacarSaldo(double valor) {
        if (valor > getSaldoConta()) {
            System.out.println("\nErro: Você não tem saldo suficiente!");
            System.out.println("Saldo atual: " + getSaldoConta());
            return false;
        } else {
            subtrairSaldo(valor);
            System.out.println("\nOperação realizada!");
            System.out.println("Saldo atual: " + getSaldoConta());
            return true;
        }
    }

    public void depositarSaldo(double valor) {
        somarSaldo(valor);
        System.out.println("\nOperação realizada!");
        System.out.println("Saldo atual: " + getSaldoConta());
    }
}
