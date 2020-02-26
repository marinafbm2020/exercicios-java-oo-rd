package exercicio02;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioMensal, double salarioAnual) {
        super(nome, salarioMensal, salarioAnual);
    }

    // TODO: implemente o código desta classe


    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }
}
