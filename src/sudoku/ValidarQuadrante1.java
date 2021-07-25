package sudoku;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Matheus Jos� de Moura - 1693239
* AS36A - Programa��o Distribu�da - N16
* Engenharia de Computa��o - UTFPR/CP
*/
public class ValidarQuadrante1 extends Thread{

	@Override
	public void run() {
	
		List<Integer> vetorQuadrante = new ArrayList<>(9);
		
		// Popula o vetor com os dados do quadrante
		vetorQuadrante = sudoku.Sudoku.popularVetorQuadrante(0, 3, 0, 3);
		
		// Valida se no mesmo quadrante h� mais de um n�mero igual
		sudoku.Sudoku.validar(vetorQuadrante, "Quadrante 01");
	}
}
