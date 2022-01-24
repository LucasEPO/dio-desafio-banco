package projeto_banco;

/**
 *
 * @author LucasEPO
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.isPoupanca = false;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n== Extrato Conta Corrente ==");
        super.imprimirInfos();
    }
    
    
}
