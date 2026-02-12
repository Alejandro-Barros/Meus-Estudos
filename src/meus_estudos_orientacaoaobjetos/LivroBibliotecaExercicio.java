package meus_estudos_orientacaoaobjetos;

import java.util.Date;

public class LivroBibliotecaExercicio {
    public static void main(String[] args) {

        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nome = "Alice no País das Maravilhas";
        livro.autor = "Lewis Carroll";
        livro.anoLançamento = 1865;
        livro.emprestado = true;
        livro.locador = "Gilvana";
        livro.dataEmprestimo = new Date();
    }
}
