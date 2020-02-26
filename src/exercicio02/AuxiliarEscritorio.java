package exercicio02;

public class AuxiliarEscritorio extends Funcionario{
    public AuxiliarEscritorio(String nome, double salarioMensal, double salarioAnual) {
        super(nome, salarioMensal, salarioAnual);
    }

    // TODO: implemente o código desta classe


    @Override
    public String toString() {
        return "AuxiliarEscritorio{" +
                "nome='" + nome + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }
}
