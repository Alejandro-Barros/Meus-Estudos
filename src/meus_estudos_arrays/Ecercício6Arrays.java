package meus_estudos_arrays;

import java.util.Random;

public class Ecercício6Arrays {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        Random numerosRandoms = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = numerosRandoms.nextInt(100);
            }
        }
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maior) {
                    maior = matrix[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("O maior valor da matrix é: " + maior);
        System.out.println("Linha " + linha);
        System.out.println("Coluna " + coluna);
    }
}
