package exercicio03;

public class FuncoesMatematicas {

	public static void main(String[] args) { //Gerar dois n�meros aleat�rios de 1 a 100 e informar qual � o maior.
		int resultadoAleatorio1 = (int)(Math.random() * 100) + 1;
		int resultadoAleatorio2 = (int)(Math.random() * 100) + 1;
		
		System.out.printf("Primeiro n�mero aleat�rio: %d%n", resultadoAleatorio1);
		System.out.printf("Segundo n�mero aleat�rio: %d%n", resultadoAleatorio2);
		System.out.printf("O maior deles �: %d%n", Math.max(resultadoAleatorio1, resultadoAleatorio2));
	}
}
