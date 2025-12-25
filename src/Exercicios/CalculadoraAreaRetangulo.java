package Exercicios;

import java.util.Scanner;

public class CalculadoraAreaRetangulo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a altura do retângulo? ");
        double altura = scan.nextDouble();

        System.out.println("Qual a largura do retângulo? ");
        double largura = scan.nextDouble();

        double areaRetangulo = altura * largura;

        System.out.println("A area do seu retângulo é de: " + (areaRetangulo *2) + "cm");

        scan.close();

    }
}
