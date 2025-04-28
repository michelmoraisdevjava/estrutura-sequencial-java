package exercicio05;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {/**
											 * Criar um programa que sorteie um número aleatório entre 1 e 1000 e o
											 * usuário tenha que adivinhar, recebendo dicas ("maior" ou "menor").
											 */
		System.out.println("Bem-vindo ao jogo de adivinhação!");
		advinhar(1000);

	}
	
	/**
     * Função que gera um número aleatório e dá dicas para o usuário advinhar.
     * 
     * @param limiteSuperior Número máximo a ser gerado.
     */
	public static void advinhar(int limiteSuperior) {
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random() * 1000) + 1;

		System.out.print("Adivinhe um número entre 1 e 1000: ");
		int numeroSugerido = sc.nextInt();
		
		int tentativas = 0;
		while (numeroAleatorio != numeroSugerido) {
			tentativas++;
			if (numeroAleatorio > numeroSugerido) {
				System.out.println("Maior");
				numeroSugerido = sc.nextInt();
			} else if(numeroAleatorio < numeroSugerido){
				System.out.println("Menor");
				numeroSugerido = sc.nextInt();
			}
		}
		System.out.printf("Acertou! Você precisou de %d tentativas.%n", tentativas);
		
		sc.close();
	}

}
