package Exercicios;

import java.util.Scanner;

public class PrecosMercado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preço do produto?");
        double preçoProduto = scan.nextDouble();

        if (preçoProduto <= 10){
            System.out.println("Está barato, compre!");}
        else if (10 < preçoProduto && preçoProduto < 15){
            System.out.println("Pesquise mais um pouco");}
        else if (preçoProduto > 15 && preçoProduto <= 17){
            System.out.println("Está caro");}
        else if (preçoProduto > 17){
            System.out.println("Não compre, muito caro");}

        scan.close();


    }
}
