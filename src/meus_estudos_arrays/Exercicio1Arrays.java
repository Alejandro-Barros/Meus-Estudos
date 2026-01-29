package meus_estudos_arrays;

import java.util.Scanner;

public class Exercicio1Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] elementosA = new int [5];
        int [] elementosB = new int [elementosA.length];

        for (int i=0; i<elementosA.length; i++){
            System.out.println("Digite o valor da posição " + i);
            elementosA[i] = scan.nextInt();

            elementosB[i] = elementosA[i];
        }
        System.out.print("Os valores de A são: ");
        for (int i = 0; i<elementosA.length; i++){
            System.out.print(elementosA[i] + " ");
        }
        System.out.println();

        System.out.print("Os valores de B são: ");
            for (int i = 0; i < elementosB.length; i++) {
                System.out.print(elementosB[i] + " ");
            }

            scan.close();
    }
}
