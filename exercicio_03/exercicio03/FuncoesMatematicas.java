package exercicio03;

public class FuncoesMatematicas {

	public static void main(String[] args) { //Gerar dois números aleatórios de 1 a 100 e informar qual é o maior.
		int resultadoAleatorio1 = (int)(Math.random() * 100) + 1;
		int resultadoAleatorio2 = (int)(Math.random() * 100) + 1;
		
		System.out.printf("Primeiro número aleatório: %d%n", resultadoAleatorio1);
		System.out.printf("Segundo número aleatório: %d%n", resultadoAleatorio2);
		System.out.printf("O maior deles é: %d%n", Math.max(resultadoAleatorio1, resultadoAleatorio2));
	}
}
