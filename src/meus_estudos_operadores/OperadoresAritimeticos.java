package meus_estudos_operadores;

public class OperadoresAritimeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 5;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);


        String primeiraFrase = "Essa é a primeira frase";
        String segundaFrase = " e essa, é a segunda frase";
        String frasesConcaternadas = primeiraFrase + segundaFrase;
        System.out.println(frasesConcaternadas);

        System.out.println(resultado++);
        System.out.println(++resultado);

        


    }
}
