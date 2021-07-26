package sudoku;

import java.util.List;

/**
 * @author Matheus Jose de Moura - 1693239
 * AS36A - Programacao Distribuida - N16
 * Engenharia de Computacao - UTFPR/CP
 */
public class ValidarColunas extends Thread {

    @Override
    public void run() {

        List<Integer> vetorColunas;

        // Percorre as nove colunas da matriz
        for (Integer i = 0; i < 9; i++) {
            // Popula a lista com os dados da coluna
            vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(i, false);

            // Valida se na coluna ha mais de um numero igual
            sudoku.Sudoku.validar(vetorColunas, "Coluna ".concat(String.valueOf(i + 1)));
            vetorColunas.clear();
        }
    }
}
