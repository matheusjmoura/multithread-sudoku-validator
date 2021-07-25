package sudoku;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Matheus Jos� de Moura - 1693239
* AS36A - Programa��o Distribu�da - N16
* Engenharia de Computa��o - UTFPR/CP
*/
public class ValidarColunas extends Thread {

	@Override
	public void run() {

		List<Integer> vetorColunas = new ArrayList<>();

		// Percorre as nove colunas da matriz
		for (Integer i = 0; i < 9; i++) {
			// Popula o vetor com os dados da coluna
			vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(i, false);
			
			// Valida se na coluna h� mais de um n�mero igual
			sudoku.Sudoku.validar(vetorColunas, "Coluna " + i+1);
			vetorColunas.clear();
		}
	}
}
