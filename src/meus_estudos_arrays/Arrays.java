package meus_estudos_arrays;

public class Arrays {
    public static void main(String[] args) {

        double [] notasAlunosA = new double[4];
        notasAlunosA[0] = 10;
        notasAlunosA[1] = 7;
        notasAlunosA[2] = 9;
        notasAlunosA[3] = 9.5;

        double[] notasAlunosB = new double[4];
        notasAlunosB = notasAlunosA;

        for (int i = 0; i < notasAlunosA.length; i++){
            System.out.println(notasAlunosA[i]);
        }
    }
}
