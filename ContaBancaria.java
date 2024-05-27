public class ContaBancaria {
    
    public static void main(String[] args) {
        // Criação de uma instância de ContaBancariaFacade
        ContaBancariaFacade acessandoBanco = new ContaBancariaFacade(12345678, 1234);
        
        // Chamadas de métodos (exemplo)
        acessandoBanco.verificarSaldo();
        acessandoBanco.realizarSaque(100.0);
        acessandoBanco.realizarDeposito(200.0);
    }
}
