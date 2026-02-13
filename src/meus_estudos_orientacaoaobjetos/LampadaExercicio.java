package meus_estudos_orientacaoaobjetos;

public class LampadaExercicio {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.cor = "amarela";
        lampada.abajur = true;
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.tipoLuz = "Amarela";

        lampada.tipos = new String[2];
        lampada.tipos[0] = "Lampeões";
        lampada.tipos[1] = "Abajur";

        lampada.ligarLampada();
        lampada.mostrarEstado();
        lampada.desligarLampada();
        lampada.mostrarEstado();

    }
}
