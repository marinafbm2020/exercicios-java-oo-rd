package exercicio02;

public class TecnicoManutencao extends Funcionario{
    public TecnicoManutencao(String nome, double salarioMensal, double salarioAnual) {
        super(nome, salarioMensal, salarioAnual);
    }

    // TODO: implemente o código desta classe


    @Override
    public String toString() {
        return "TecnicoManutencao{" +
                "nome='" + nome + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }
}
