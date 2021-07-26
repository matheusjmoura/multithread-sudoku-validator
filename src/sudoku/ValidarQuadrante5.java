package sudoku;

import java.util.List;

/**
 * @author Matheus Jose de Moura - 1693239
 * AS36A - Programacao Distribuida - N16
 * Engenharia de Computacao - UTFPR/CP
 */
public class ValidarQuadrante5 extends Thread {

    @Override
    public void run() {

        List<Integer> vetorQuadrante;

        // Popula a lista com os dados do quadrante
        vetorQuadrante = sudoku.Sudoku.popularVetorQuadrante(3, 6, 3, 6);

        // Valida se no mesmo quadrante ha mais de um numero igual
        sudoku.Sudoku.validar(vetorQuadrante, "Quadrante 5");
    }
}