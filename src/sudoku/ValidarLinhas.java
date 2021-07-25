package sudoku;

import java.util.List;

/**
 * @author Matheus José de Moura - 1693239
 * AS36A - Programação Distribuída - N16
 * Engenharia de Computação - UTFPR/CP
 */
public class ValidarLinhas extends Thread {

    @Override
    public void run() {

        List<Integer> vetorLinhas;

        // Percorre as nove linhas da matriz
        for (Integer i = 0; i < 9; i++) {
            // Popula a lista com os dados da linha
            vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(i, true);

            // Valida se na linha há mais de um número igual
            sudoku.Sudoku.validar(vetorLinhas, "Linha ".concat(String.valueOf(i + 1)));
            vetorLinhas.clear();
        }
    }
}
