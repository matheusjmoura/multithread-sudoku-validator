package sudoku;

import java.util.List;

/**
 * @author Matheus Jose de Moura - 1693239
 * AS36A - Programacao Distribuida - N16
 * Engenharia de Computacao - UTFPR/CP
 */
public class ValidarLinhas extends Thread {

    @Override
    public void run() {

        List<Integer> vetorLinhas;

        // Percorre as nove linhas da matriz
        for (Integer i = 0; i < 9; i++) {
            // Popula a lista com os dados da linha
            vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(i, true);

            // Valida se na linha ha mais de um numero igual
            sudoku.Sudoku.validar(vetorLinhas, "Linha ".concat(String.valueOf(i + 1)));
            vetorLinhas.clear();
        }
    }
}
