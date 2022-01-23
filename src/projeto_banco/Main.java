package projeto_banco;

/**
 *
 * @author LucasEPO
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        
        Conta cCorrente = new ContaCorrente(cliente);
        Conta cPoupanca = new ContaPoupanca(cliente);
        
        cCorrente.depositar(100);
        cCorrente.transferir(50, cPoupanca);
        
        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();
    }
    
}
