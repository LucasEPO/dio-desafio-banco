package projeto_banco;

/**
 *
 * @author LucasEPO
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.isPoupanca = true;
        
    }
    
    public void render(){
        this.saldo *= 0.10;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n== Extrato Conta Poupanca ==");
        super.imprimirInfos();
    }
    
    
}
