package Exercicios;

import java.util.Scanner;

public class CalculadoraNumerosReais {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        double primeiroInteiro = scan.nextDouble();

        System.out.println("Digite o segundo número inteiro: ");
        double segundoInteiro = scan.nextDouble();

        System.out.println("Digite o número real: ");
        double real = scan.nextDouble();

        double produto = 2*(primeiroInteiro + (segundoInteiro/2));
        double soma = (3*primeiroInteiro) + real;
        double elevado = Math.pow(real, 3);

        System.out.println("O resultado de a) é: " + produto);
        System.out.println("O resultado de b) é: " + soma);
        System.out.println("O resultado de c) é: " + elevado);

        scan.close();
    }
}
