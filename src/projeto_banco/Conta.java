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
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = numeroCliente++;
        this.saldo = 0;
        this.cliente = cliente;
    }
    
    
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

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    

    public void imprimirInfos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero da Conta: %d", this.getNumero()));
        System.out.println(String.format("Titular: %.2f", this.getSaldo()));
    }
    
}
