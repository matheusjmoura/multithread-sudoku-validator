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

		// Popula o vetor com os dados da linha 1
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(0, true);
				
		// Valida se na linha 1 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 1");
		vetorLinhas.clear();
		
		
		// Popula o vetor com os dados da linha 2
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(1, true);
		
		// Valida se na linha 2 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 2");
		vetorLinhas.clear();

		// Popula o vetor com os dados da linha 3
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(2, true);
		
		// Valida se na linha 3 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 3");
		vetorLinhas.clear();
		
		// Popula o vetor com os dados da linha 4
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(3, true);
		
		// Valida se na linha 4 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 4");
		vetorLinhas.clear();

		// Popula o vetor com os dados da linha 5
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(4, true);
		
		// Valida se na linha 5 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 5");
		vetorLinhas.clear();

		// Popula o vetor com os dados da linha 6
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(5, true);
		
		// Valida se na linha 6 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 6");
		vetorLinhas.clear();

		// Popula o vetor com os dados da linha 7
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(6, true);
		
		// Valida se na linha 7 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 7");
		vetorLinhas.clear();

		// Popula o vetor com os dados da linha 8
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(7, true);
		
		// Valida se na linha 8 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 8");
		vetorLinhas.clear();

		// Popula o vetor com os dados da linha 9
		vetorLinhas = sudoku.Sudoku.popularVetorLinhaColuna(8, true);
		
		// Valida se na linha 9 há mais de um número igual
		sudoku.Sudoku.validar(vetorLinhas, "Linha 9");
		vetorLinhas.clear();
	}
}
