package Exercicios;

public class Númerosde1a1000 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i > 200 && i < 900)
                continue;
            System.out.println(i);
        }
    }
}
