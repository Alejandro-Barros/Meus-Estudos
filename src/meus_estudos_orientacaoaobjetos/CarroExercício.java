package meus_estudos_orientacaoaobjetos;

public class CarroExercício {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustível = 100;
        van.consumoCombustível = 0.2;

        van.exibirAutonomia();
        double autonomia = van.obterAutonomia();
        System.out.println(autonomia);
        double qtdCombustível = van.calcularCombustível(15);
        System.out.println(qtdCombustível);
    }
}
