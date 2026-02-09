package meus_estudos_arrays;

import java.util.Scanner;

public class Exercicio4Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui os elementos do Vetor A");

        double [] vetorA = new double[15];
        double [] vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i);

            vetorA [i] = scan.nextDouble();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.print("Os valores do vetor B são ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + ", ");
        }
        scan.close();
    }
}
