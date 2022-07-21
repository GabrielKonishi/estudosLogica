package desafio4;

public class SomaDeMultiplos {

	public static void quartoDesafio() {
		int numero = 10;
		int valorTotal = 0;
		
		
		somaDosNumerosMultiplos(numero, valorTotal);
	}

	private static void somaDosNumerosMultiplos(int numero, int valorTotal) {
		for (int i = numero - 1; i >= 1; i--) {
			if (isMultiploDeTres(i) || isMultiploDeCinco(i)) {
				valorTotal = valorTotal + i;
				
			}
			
		}
		
		System.out.println("\n--------------------------------Dados retornados do quarto desafio--------------------------------");
		System.out.println("retorno da soma dos valores abaixo do valor solicitado: " + valorTotal);
	}
	
	private static boolean isMultiploDeTres(int numero) {
		if (numero % 3 == 0) {
			return true;
		}
		return false;
		
	}
	
	private static boolean isMultiploDeCinco(int numero) {
		if (numero % 5 == 0) {
			return true;
		}
		return false;
		
	}
	
}
