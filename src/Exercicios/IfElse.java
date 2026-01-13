package Exercicios;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int primeiro = scan.nextInt();
        System.out.println("Digite o segundo número");
        int segundo = scan.nextInt();

        if (primeiro > segundo) {
            System.out.println("O número " + primeiro + " é maior");
        } else {
            System.out.println("O número " + segundo + " é maior");
        }
        scan.close();
    }

}