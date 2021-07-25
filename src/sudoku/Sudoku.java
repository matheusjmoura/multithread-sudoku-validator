package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author Matheus José de Moura - 1693239
* AS36A - Programação Distribuída - N16
* Engenharia de Computação - UTFPR/CP
*/
public class Sudoku {
	
    static final Integer[][] sudoku = {
            {2, 3, 7, 8, 4, 1, 5, 6, 9},
            {1, 8, 6, 7, 9, 5, 2, 4, 3},
            {5, 9, 4, 3, 2, 6, 7, 1, 8},
            {3, 1, 5, 6, 7, 4, 8, 9, 2},
            {4, 6, 9, 5, 8, 2, 1, 3, 7},
            {7, 2, 8, 1, 3, 9, 4, 5, 6},
            {6, 4, 2, 9, 1, 8, 3, 7, 5},
            {8, 5, 3, 4, 6, 7, 9, 2, 1},
            {9, 7, 1, 2, 5, 3, 6, 8, 4}
    };
    
	public static void validar(List<Integer> vetorComparacao, String posicao) {
		List<Integer> vetorGabarito = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		vetorGabarito.forEach(numeroGabarito -> {
			List<Integer> numerosIguais = vetorComparacao.stream()
				.filter(numeroQuadrante -> numeroGabarito.equals(numeroQuadrante))
				.collect(Collectors.toList());
			if (numerosIguais.size() > 1) System.out.println("Erro: " + posicao);
		});
	}
	
	public static List<Integer> popularVetorQuadrante(Integer inicioLinha,
			Integer finalLinha, Integer inicioColuna, Integer finalColuna) {
		List<Integer> vetorQuadrante = new ArrayList<>();
		for (Integer linha = inicioLinha; linha < finalLinha; linha++) {
			for (Integer coluna = inicioColuna; coluna < finalColuna; coluna++) {
				vetorQuadrante.add(sudoku[linha][coluna]);
			}
		}
		return vetorQuadrante;
	}
	
	public static List<Integer> popularVetorLinhaColuna(Integer posicao,
			Boolean isLinha) {
		List<Integer> vetorLinhaColuna = new ArrayList<>();
		for (Integer referencia = 0; referencia < 9; referencia++) {
			if (isLinha) vetorLinhaColuna.add(sudoku[posicao][referencia]);
			else vetorLinhaColuna.add(sudoku[referencia][posicao]);
		}		
		return vetorLinhaColuna;
	}
    
	public static void main(String args[]) {

		ValidarLinhas validaLinha = new ValidarLinhas();
		ValidarColunas validaColuna = new ValidarColunas();
		ValidarQuadrante1 validaQuadrante1 = new ValidarQuadrante1();
		ValidarQuadrante2 validaQuadrante2 = new ValidarQuadrante2();
		ValidarQuadrante3 validaQuadrante3 = new ValidarQuadrante3();
		ValidarQuadrante4 validaQuadrante4 = new ValidarQuadrante4();
		ValidarQuadrante5 validaQuadrante5 = new ValidarQuadrante5();
		ValidarQuadrante6 validaQuadrante6 = new ValidarQuadrante6();
		ValidarQuadrante7 validaQuadrante7 = new ValidarQuadrante7();
		ValidarQuadrante8 validaQuadrante8 = new ValidarQuadrante8();
		ValidarQuadrante9 validaQuadrante9 = new ValidarQuadrante9();
		
		validaLinha.start();
		validaColuna.start();
		validaQuadrante1.start();
		validaQuadrante2.start();
		validaQuadrante3.start();
		validaQuadrante4.start();
		validaQuadrante5.start();
		validaQuadrante6.start();
		validaQuadrante7.start();
		validaQuadrante8.start();
		validaQuadrante9.start();
		
		try {
			validaLinha.join();
			validaColuna.join();
			validaQuadrante1.join();
			validaQuadrante2.join();
			validaQuadrante3.join();
			validaQuadrante4.join();
			validaQuadrante5.join();
			validaQuadrante6.join();
			validaQuadrante7.join();
			validaQuadrante8.join();
			validaQuadrante9.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Sudoku.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		System.out.println("Processo de validação finalizado.");
	}

}
