package exercicio05;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {/**
											 * Criar um programa que sorteie um n�mero aleat�rio entre 1 e 1000 e o
											 * usu�rio tenha que adivinhar, recebendo dicas ("maior" ou "menor").
											 */
		System.out.println("Bem-vindo ao jogo de adivinha��o!");
		advinhar(1000);

	}
	
	/**
     * Fun��o que gera um n�mero aleat�rio e d� dicas para o usu�rio advinhar.
     * 
     * @param limiteSuperior N�mero m�ximo a ser gerado.
     */
	public static void advinhar(int limiteSuperior) {
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random() * 1000) + 1;

		System.out.print("Adivinhe um n�mero entre 1 e 1000: ");
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
		System.out.printf("Acertou! Voc� precisou de %d tentativas.%n", tentativas);
		
		sc.close();
	}

}
