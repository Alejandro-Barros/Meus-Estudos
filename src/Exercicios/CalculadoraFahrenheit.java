package Exercicios;

import java.util.Scanner;

public class CalculadoraFahrenheit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a temperatura em Graus Celsius (°C)? ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius*9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");

        scan.close();

    }
}
