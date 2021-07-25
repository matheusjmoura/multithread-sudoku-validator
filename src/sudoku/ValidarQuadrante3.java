package sudoku;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Matheus José de Moura - 1693239
* AS36A - Programação Distribuída - N16
* Engenharia de Computação - UTFPR/CP
*/
public class ValidarQuadrante3 extends Thread {
	
	@Override
	public void run() {
	
		List<Integer> vetorQuadrante = new ArrayList<>(9);
		
		// Popula o vetor com os dados do quadrante
		vetorQuadrante = sudoku.Sudoku.popularVetorQuadrante(0, 3, 6, 9);
		
		// Valida se no mesmo quadrante há mais de um número igual
		sudoku.Sudoku.validar(vetorQuadrante, "Quadrante 3");
	}
}