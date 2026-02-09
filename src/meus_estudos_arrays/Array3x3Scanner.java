package meus_estudos_arrays;

import java.util.Scanner;

public class Array3x3Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrixTres = new int[3][3];

        for (int i = 0; i < matrixTres.length; i++) {
            for (int j = 0; j < matrixTres[i].length; j++) {

                System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
                matrixTres[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrixTres.length; i++) {
            for (int j = 0; j < matrixTres[i].length; j++) {
                System.out.print(matrixTres[i][j] + " ");
            }
            System.out.println();
        }
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matrixTres.length; i++) {
            for (int j = 0; j < matrixTres[i].length; j++) {
                if (matrixTres[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("A quantidade de números pares é: " +pares);
        System.out.println("A quantidade de números impares é: " +impares);
    }
}