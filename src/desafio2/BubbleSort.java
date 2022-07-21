package desafio2;

import java.util.Arrays;

public class BubbleSort {
	
	public static void segundoDesafio() {
		int vetor[] = {5, 3, 2, 4, 7, 1, 0, 6};
			
		for (int numeroRepeticoes = vetor.length; numeroRepeticoes > 1; numeroRepeticoes--) {
			for (int iteradorValorEsquerdo = 0; iteradorValorEsquerdo < numeroRepeticoes; iteradorValorEsquerdo++) {
				
				for (int iteradorValorDireito = iteradorValorEsquerdo + 1; iteradorValorDireito < numeroRepeticoes;) {
					
					if (vetor[iteradorValorEsquerdo] > vetor[iteradorValorDireito]) {
						//SE O VALOR DA DIREITA FOR MENOR QUE DA ESQUERDA, É EFETUADO A TROCA DE VALORES PASSANDO O MENOR VALOR PARA A ESQUERDA
						substituicaoDosValores(vetor, iteradorValorEsquerdo, iteradorValorDireito);
						break;
						
					} 
					break;
					
				}
				
			}
			
		}
		
		System.out.println("\n--------------------------------Dados retornados do segundo desafio--------------------------------");
		System.out.println(Arrays.toString(vetor));
		
	}

	private static void substituicaoDosValores(int[] vetor, int iteradorValorEsquerdo, int iteradorValorDireito) {
		int valorMaior = vetor[iteradorValorEsquerdo];
		vetor[iteradorValorEsquerdo] = vetor[iteradorValorDireito];
		vetor[iteradorValorDireito] = valorMaior;
	}

}
