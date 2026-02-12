package meus_estudos_orientacaoaobjetos;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustível;
    double consumoCombustível;

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capCombustível * consumoCombustível + "km");
    }

    double obterAutonomia() {

        System.out.println("Método com return, para obter autonomia.");

        return capCombustível * consumoCombustível;
    }
    double calcularCombustível(double km) {
        double quantidadeCombustível = km/consumoCombustível;
        return quantidadeCombustível;
    }
}
