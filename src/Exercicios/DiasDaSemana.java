package Exercicios;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui um número de 1-7");

        int dia = scan.nextInt();

        switch (dia){
            case 1: System.out.println("Segunda"); break;
            case 2: System.out.println("Terça"); break;
            case 3: System.out.println("Quarta"); break;
            case 4: System.out.println("Quinta"); break;
            case 5: System.out.println("Sexta"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Não é um dia da semana válido"); break;
        }
        scan.close();


    }
}
