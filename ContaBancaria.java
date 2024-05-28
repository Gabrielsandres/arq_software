public class ContaBancaria {
    public static void main(String[] args) {
        // Criação de uma instância de ContaBancariaFacade
        ContaBancariaFacade acessandoBanco = new ContaBancariaFacade(12345678, 1234);
        
        // Chamadas de métodos (exemplo)
        acessandoBanco.verificarSaldo();
        acessandoBanco.sacarSaldo(100.0);
        acessandoBanco.depositarSaldo(200.0);
    }
}

