# Java MultiThread Sudoku Validator

Exercício do livro Fundamentos de Sistemas Operacionais de A. Silberschatz, P. Galvin, G. Gagne página 110.

Um quebra-cabeça Sudoku usa uma matriz de 9x9 em que cada coluna e cada linha, assim como cada um dos nove quadrantes 3x3 devem conter todos os dígitos 1...9. Esse exercício consiste na elaboração de uma aplicação, com múltiplos threads, que determina se a solução para um quebra-cabeça Sudoku é válida.
A estratégia utilizada foi criar threads em Java que verifiquem os critérios a seguir:
- Um thread para verificar se cada coluna contém os dígitos de 1 a 9
- Um thread para verifica se cada linha contém os dígitos de 1 a 9
- Nove threads para verificar se cada um dos subgrids 3x3 contém os dígitos de 1 a 9
Isso resulta em um total de onze threads separadas para a validação de um quebra-cabeça Sudoku.
