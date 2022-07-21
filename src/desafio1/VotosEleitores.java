package desafio1;

public class VotosEleitores {
	
	public static Integer percentualValidos(Integer totalEleitores, Integer eleitoresValidos) {
		Integer percentualValidos = (eleitoresValidos * 100) / totalEleitores;
		return percentualValidos;
	}
	
	public static Integer percentualVotosEmBranco(Integer totalEleitores, Integer votosBrancos) {
		Integer percentualVotosBrancos = (votosBrancos * 100) / totalEleitores;
		return percentualVotosBrancos;
	}
	
	public static Integer percentualVotosNulo(Integer totalEleitores, Integer votosNulos) {
		Integer percentualVotosNulos = (votosNulos * 100) / totalEleitores;
		return percentualVotosNulos;
	}
	
	public static void primeiroDesafio() {
		Integer totalEleitores = 1000;
		Integer eleitoresValidos = 800;
		Integer votosBrancos = 150;
		Integer votosNulos = 50;
		
		System.out.println("--------------------------------Dados retornados do primeiro desafio--------------------------------");
		System.out.println("Percentual votos válidos = " + VotosEleitores.percentualValidos(totalEleitores, eleitoresValidos));
		System.out.println("Percentual votos em branco = " + VotosEleitores.percentualVotosEmBranco(totalEleitores, votosBrancos));
		System.out.println("Percentual votos nulos = " + VotosEleitores.percentualVotosNulo(totalEleitores, votosNulos));
	}
	
}
