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

		// Popula o vetor com os dados da coluna 1
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(0, false);
		
		// Valida se na coluna 1 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 1");
		vetorColunas.clear();
		
		
		// Popula o vetor com os dados da coluna 2
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(1, false);
		
		// Valida se na coluna 2 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 2");
		vetorColunas.clear();

		// Popula o vetor com os dados da coluna 3
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(2, false);
		
		// Valida se na coluna 3 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 3");
		vetorColunas.clear();
		
		// Popula o vetor com os dados da coluna 4
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(3, false);
		
		// Valida se na coluna 4 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 4");
		vetorColunas.clear();

		// Popula o vetor com os dados da coluna 5
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(4, false);
		
		// Valida se na coluna 5 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 5");
		vetorColunas.clear();

		// Popula o vetor com os dados da coluna 6
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(5, false);
		
		// Valida se na coluna 6 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 6");
		vetorColunas.clear();

		// Popula o vetor com os dados da coluna 7
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(6, false);
		
		// Valida se na coluna 7 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 7");
		vetorColunas.clear();

		// Popula o vetor com os dados da coluna 8
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(7, false);
		
		// Valida se na coluna 8 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 8");
		vetorColunas.clear();

		// Popula o vetor com os dados da coluna 9
		vetorColunas = sudoku.Sudoku.popularVetorLinhaColuna(8, false);
		
		// Valida se na coluna 9 h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorColunas, "Coluna 9");
		vetorColunas.clear();
	}
}
