package meus_estudos_arrays;

import java.util.Random;

public class TesteArray {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];
        Random random = new Random();

        // Preencher matriz com valores aleatórios (0 a 9)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        // Imprimir matriz
        System.out.println("Matriz 10x10:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int linha = 4;   // Linha 5 (índice 4)
        int coluna = 6; // Coluna 7 (índice 6)

        // Inicialização para linha 5
        int menorLinha = matriz[linha][0];
        int maiorLinha = matriz[linha][0];

        // Encontrar menor e maior da linha 5
        for (int j = 0; j < 10; j++) {
            if (matriz[linha][j] < menorLinha) {
                menorLinha = matriz[linha][j];
            }

            if (matriz[linha][j] > maiorLinha) {
                maiorLinha = matriz[linha][j];
            }
        }

        // Inicialização para coluna 7
        int menorColuna = matriz[0][coluna];
        int maiorColuna = matriz[0][coluna];

        // Encontrar menor e maior da coluna 7
        for (int i = 0; i < 10; i++) {
            if (matriz[i][coluna] < menorColuna) {
                menorColuna = matriz[i][coluna];
            }

            if (matriz[i][coluna] > maiorColuna) {
                maiorColuna = matriz[i][coluna];
            }
        }

        // Impressão dos resultados
        System.out.println("Resultados:");

        System.out.println("Linha 5:");
        System.out.println("Menor valor: " + menorLinha);
        System.out.println("Maior valor: " + maiorLinha);

        System.out.println("Coluna 7:");
        System.out.println("Menor valor: " + menorColuna);
        System.out.println("Maior valor: " + maiorColuna);
    }
}
