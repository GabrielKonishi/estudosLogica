package desafio3;

public class Fatorial {

	public static void terceiroDesafio() {
		int valorFatorial = 3;
		int valorTotal = 1;
		
		for (int i = 1; i < valorFatorial + 1; i++) {
			valorTotal = valorTotal * i;
		}
		
		System.out.println("\n--------------------------------Dados retornados do terceiro desafio--------------------------------");
		System.out.println(valorTotal);
	}
}
