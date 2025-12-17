package meus_estudos_scanner;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite sua idade: ");
        int idadeUsuario = scan.nextInt();
        System.out.println("Sua idade é: " + idadeUsuario);

        System.out.println("Digite sua altura: ");
        double alturaUsuario = scan.nextDouble();
        System.out.println("Sua idade é: " + alturaUsuario);

        System.out.println("Seu nome completo é " + nomeCompleto + ", sua idade é " + idadeUsuario);

    }
}
