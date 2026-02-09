package meus_estudos_arrays;

import java.util.Random;

public class Exercicio5Arrays {
    public static void main(String[] args) {

        int[][] matrixM = new int[10][10];

        Random numerosRandom = new Random();

        for (int i = 0; i < matrixM.length; i++) {
            for (int j = 0; j < matrixM.length; j++) {
                matrixM[i][j] = numerosRandom.nextInt(9);

                System.out.print(matrixM[i][j] + " ");
            }
            System.out.println();
        }
    }
}