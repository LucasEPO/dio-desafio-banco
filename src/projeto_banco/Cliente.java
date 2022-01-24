package projeto_banco;

/**
 *
 * @author LucasEPO
 */
public class Cliente {

    private String nome;
    private int idade;
    private double salario;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.salario = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
