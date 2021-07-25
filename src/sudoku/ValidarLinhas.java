package sudoku;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Matheus José de Moura - 1693239
* AS36A - Programação Distribuída - N16
* Engenharia de Computação - UTFPR/CP
*/
public class ValidarLinhas extends Thread {
	
	@Override
	public void run() {

		List<Integer> vetorLinhas = new ArrayList<>();
		
		// Percorre as nove linhas da matriz
		for (Integer i = 0; i < 9; i++) {
			// Popula o vetor com os dados da linha
			vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(i, true);
			
			// Valida se na linha há mais de um número igual
			sudoku.Sudoku.validar(vetorLinhas, "Linha " + i+1);
			vetorLinhas.clear();
		}
	}
}
