package projeto_banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LucasEPO
 */
public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco1");
        List<Conta> contas = new ArrayList<>();
        
        Cliente cliente = new Cliente("Lucas", 21);
        cliente.setSalario(1500.90);
        Conta cCorrente = new ContaCorrente(cliente);
        Conta cPoupanca = new ContaPoupanca(cliente);
        contas.add(cCorrente);
        contas.add(cPoupanca);
        banco.setContas(contas);
        
        cCorrente.depositar(100);
        cCorrente.transferir(20, cPoupanca);
        cPoupanca.depositar(60);
        
        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();
        
        
        atualizaMes(banco.getContas());
        System.out.println("\n---2 mes--");
        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();
        
        /*Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        
        Conta cCorrente = new ContaCorrente(cliente);
        Conta cPoupanca = new ContaPoupanca(cliente);
        
        cCorrente.depositar(100);
        cCorrente.transferir(50, cPoupanca);
        
        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();*/
    }
    
    public static void atualizaMes(List<Conta> contas){
        contas.forEach(conta -> {
            conta.depositar(conta.cliente.getSalario());
            if(conta.isPoupanca){
                 conta.depositar(conta.getSaldo()*0.10);
            }
        });
    }
    
}
