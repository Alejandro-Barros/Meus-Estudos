package Exercicios;

import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui o valor em metros a ser convertido: ");
        double metros = scan.nextDouble();
        System.out.println("O valor convertido é: " + metros*100);

    }
}
