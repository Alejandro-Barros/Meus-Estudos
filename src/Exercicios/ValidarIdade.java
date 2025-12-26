package Exercicios;

import java.util.Scanner;

public class ValidarIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();

        if (idade >= 18){
        System.out.println("Voce é maior de idade");
        } else {
            System.out.println("Voce é menor de idade");}

            scan.close();
    }
}
