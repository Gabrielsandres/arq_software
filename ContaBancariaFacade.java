public class ContaBancariaFacade {
    private int numeroConta;
    private int codigoSeguranca;

    VerificadorNumeroConta verificaNumConta;
    VerificadorCodSeguranca verificaCodSeguranca;
    VerificadorSaldo verificaSaldo;
    BemVindo bemVindo;

    public ContaBancariaFacade(int numConta, int codSeguranca) {
        numeroConta = numConta;
        codigoSeguranca = codSeguranca;

        bemVindo = new BemVindo();
        verificaNumConta = new VerificadorNumeroConta();
        verificaCodSeguranca = new VerificadorCodSeguranca();
        verificaSaldo = new VerificadorSaldo();
    }

    public int getNumeroConta() { return numeroConta; }
    public int getCodSeguranca() { return codigoSeguranca; }

    public void verificarSaldo() {
        System.out.println("Saldo atual: " + verificaSaldo.getSaldoConta());
    }

    public void sacarSaldo(double valor) {
        if (verificaNumConta.contaAtiva(numeroConta) && verificaCodSeguranca.codCorreto(codigoSeguranca) && verificaSaldo.sacarSaldo(valor)) {
            System.out.println("\nTransação completa!");
        } else {
            System.out.println("\nTransação falhou!");
        }
    }

    public void depositarSaldo(double valor) {
        if (verificaNumConta.contaAtiva(numeroConta) && verificaCodSeguranca.codCorreto(codigoSeguranca)) {
            verificaSaldo.depositarSaldo(valor);
            System.out.println("\nTransação completa!");
        } else {
            System.out.println("\nTransação falhou!");
        }
    }
}
