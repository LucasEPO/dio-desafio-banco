package projeto_banco;

/**
 *
 * @author LucasEPO
 */
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int numeroCliente = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    

}
