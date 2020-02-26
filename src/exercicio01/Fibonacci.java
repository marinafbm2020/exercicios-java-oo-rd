package exercicio01;

public class Fibonacci {

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return
     */
    public int[] getSequenciaFibonacciDe(int tamanho) {
        // TODO: implemente o código deste método
        int n1=0, n2=1, n3,i,count=10;
        System.out.println((n1+ " "+n2));
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

        return new int[0];
    }

}
