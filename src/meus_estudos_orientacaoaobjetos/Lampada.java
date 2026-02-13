package meus_estudos_orientacaoaobjetos;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String [] tipos;
    boolean abajur;
    boolean ligada;

    void ligarLampada(){
        ligada = true;
    }
    void desligarLampada(){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada){
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
    void mudarEstado(){
        if (ligada){
            desligarLampada();
        } else {
            ligarLampada();
        }
    }
}
