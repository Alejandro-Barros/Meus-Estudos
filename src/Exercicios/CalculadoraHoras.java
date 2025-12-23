package Exercicios;

import java.util.Scanner;

public class CalculadoraHoras {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você recebe por hora? ");
        double salarioHoras = scan.nextDouble();

        System.out.println("Quantas horas você trabalhou este mês? ");
        double quantidadeHoras = scan.nextDouble();

        double salarioMensal = salarioHoras * quantidadeHoras;
        System.out.println("Seu salário mensal é: R$ " + salarioMensal);

        scan.close();


    }
}
