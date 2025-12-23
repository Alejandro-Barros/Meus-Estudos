package Exercicios;

import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow (raio, 2);
        System.out.println("A área do círculo é: " + area);

        scan.close();

    }
}
