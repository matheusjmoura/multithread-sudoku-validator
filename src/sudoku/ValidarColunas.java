package sudoku;

import java.util.List;

/**
 * @author Matheus José de Moura - 1693239
 * AS36A - Programação Distribuída - N16
 * Engenharia de Computação - UTFPR/CP
 */
public class ValidarColunas extends Thread {

    @Override
    public void run() {

        List<Integer> vetorColunas;

        // Percorre as nove colunas da matriz
        for (Integer i = 0; i < 9; i++) {
            // Popula a lista com os dados da coluna
            vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(i, false);

            // Valida se na coluna há mais de um número igual
            sudoku.Sudoku.validar(vetorColunas, "Coluna ".concat(String.valueOf(i + 1)));
            vetorColunas.clear();
        }
    }
}
