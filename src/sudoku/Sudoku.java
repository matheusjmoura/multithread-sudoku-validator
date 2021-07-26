package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author Matheus Jose de Moura - 1693239
 * AS36A - Programacao Distribuida - N16
 * Engenharia de Computacao - UTFPR/CP
 */
public class Sudoku {

    static final Integer[][] solucaoSudoku = {
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

    static Logger logger = Logger.getLogger(Sudoku.class.getName());

    // Valida se na linha/coluna/quadrante analisado ha mais de um numero igual
    public static void validar(List<Integer> vetorComparacao, String posicao) {
        List<Integer> vetorGabarito = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        vetorGabarito.forEach(numeroGabarito -> {
            List<Integer> numerosIguais = vetorComparacao
                .stream()
                .filter(numeroGabarito::equals)
                .collect(Collectors.toList());
            if (numerosIguais.size() > 1)
                logger.warning("Erro - ".concat(posicao));
        });
    }

    // Popula a lista de comparacao com os dados do quadrante a ser validado
    public static List<Integer> popularVetorQuadrante(Integer inicioLinha, Integer finalLinha, Integer inicioColuna,
                                                      Integer finalColuna) {
        List<Integer> vetorQuadrante = new ArrayList<>();
        for (Integer linha = inicioLinha; linha < finalLinha; linha++) {
            vetorQuadrante.addAll(Arrays.asList(solucaoSudoku[linha]).subList(inicioColuna, finalColuna));
        }
        return vetorQuadrante;
    }

    // Popula a lista de comparacao com os dados da linha/coluna a ser validada
    public static List<Integer> popularVetorLinhaColuna(Integer posicao, Boolean isLinha) {
        List<Integer> vetorLinhaColuna = new ArrayList<>();
        for (Integer referencia = 0; referencia < 9; referencia++) {
            if (Boolean.TRUE.equals(isLinha))
                vetorLinhaColuna.add(solucaoSudoku[posicao][referencia]);
            else
                vetorLinhaColuna.add(solucaoSudoku[referencia][posicao]);
        }
        return vetorLinhaColuna;
    }

    public static void main(String[] args) {

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
            logger.log(Level.SEVERE, null, ex);
            Thread.currentThread().interrupt();
        }

        logger.info("Processo de validacao finalizado.");
    }
}
