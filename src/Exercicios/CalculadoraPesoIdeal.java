package Exercicios;

import java.util.Scanner;

public class CalculadoraPesoIdeal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua altura? ");
        double altura = scan.nextDouble();

        double pesoIdeal = ((altura*72.7) - 58);

        System.out.println("Seu peso ideal é: " + pesoIdeal + "Kg");

        scan.close();

    }
}
