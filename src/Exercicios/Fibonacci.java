package Exercicios;

public class Fibonacci {
    public static void main(String[] args) {

        int i = 0;
        int n = 1;
        while (n < 100) {
            System.out.println(n);
            int fibo = n + i;
            i = n;
            n = fibo;}
        {
            System.out.println(n);
        }
    }
}
