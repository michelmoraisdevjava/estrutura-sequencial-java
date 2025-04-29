package desafio01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal que representa a Maquina Matematica.
 * O programa permite que o usuario escolha operacoes matematicas e obtenha resultados.
 * Operacoes disponiveis:
 * 1 - Calcular potencia
 * 2 - Calcular raiz quadrada
 * 3 - Arredondar n�mero
 * 4 - Encontrar maior ou menor valor
 * 5 - Gerar numero aleat�rio
 * 0 - Encerrar o programa
 */

public class MaquinaMatematica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Programa M�quina de Matem�tica!");

		System.out.println();
		
		exibirMenu();// Exibe op��es dispon�veis ao usu�rio
		
		executarPrograma(sc); // Inicia o processamento da escolha do usu�rio
		
		sc.close();

	}
	
	/**
     * Exibe o menu com as opera��es dispon�veis.
     */
	public static void exibirMenu() {
		System.out.println("Escolha a opera��o desejada:"); 
		System.out.println("1 - Calcular pot�ncia"); 
		System.out.println("2 - Calcular raiz quadrada");
		System.out.println("3 - Arredondar n�mero"); 
		System.out.println("4 - Encontrar maior ou menor valor"); 
		System.out.println("5 - Gerar n�mero aleat�rio");
		System.out.println("0 - Sair do Programa");
	}
	
	/**
     * M�todo para validar entrada do usu�rio, garantindo que seja um n�mero inteiro.
     * @param sc Scanner utilizado para a entrada do usu�rio.
     * @return Um n�mero inteiro v�lido digitado pelo usu�rio.
     */
	public static int validarEntradaInt(Scanner sc) {
		while (!sc.hasNextInt()) { // Verifica se a entrada � um n�mero v�lido
	        System.out.print("Entrada inv�lida. Digite um n�mero da op��o: ");
	        sc.next(); // Descarta entrada inv�lida
	    }
		return sc.nextInt();
	}
	
	/**
     * Processa a escolha do usu�rio e executa a opera��o correspondente.
     * @param sc Scanner utilizado para capturar entrada do usu�rio.
     */
	public static void executarPrograma(Scanner sc) {
		int escolha;
		
		do {
			System.out.print("\nEscolha a opera��o desejada: ");
			escolha = validarEntradaInt(sc);
			
			if(escolha == 0) {// Caso especial: encerramento do programa
				System.out.println("Fim do Programa! Obrigado por usar!");
				break;
			}

			switch (escolha) {
			case 1:
				System.out.print("Digite o valor desejado: ");
				double numero = sc.nextDouble();
				System.out.printf("A pot�ncia do n�mero %.2f �: %.2f%n", numero, calcularPotencia(numero));
				break;
			case 2:
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				System.out.printf("A raiz Quadrada do n�mero %.2f �: %.2f%n", numero, calcularRaizQuadrada(numero));
				break;
			case 3:
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				System.out.printf("O valor arredondado do n�mero %.2f � %.2f%n", numero, arredondarNumero(numero));
				break;
			case 4:
				System.out.print("Digite:\n" 
						+ "1 - Para encontrar o maior valor\n" 
						+ "2 - Para encontrar o menor valor\n");
				int escolhido;
		        do {
		            System.out.print("Escolha (1 ou 2): ");
		            while (!sc.hasNextInt()) { // Verifica se a entrada � um n�mero v�lido
		                System.out.println("Entrada inv�lida. Digite um n�mero inteiro (1 ou 2).");
		                sc.next(); // Descarta entrada inv�lida
		            }

		            escolhido = sc.nextInt();

		            if (escolhido != 1 && escolhido != 2) {
		                System.out.println("Op��o inv�lida!");
		            }
		        } while (escolhido != 1 && escolhido != 2); // Garante entrada v�lida
				
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				System.out.print("Digite o segundo valor: ");
				double numero2 = sc.nextDouble();
				System.out.printf("O resultado �: %.2f%n", maiorOuMenor(numero, numero2, escolhido));
				break;
			case 5:
				System.out.printf("Valor gerado aleatoriamente �: %.2f%n", gerarNumero());
				break;
			default:
				System.out.println("Valor inv�lido!");
				break;
			}
			
		} while(true); // Mant�m o loop ativo at� que `break` seja acionado pelo caso `0`
		
	}
	
	public static double calcularPotencia(double numero) {
		return Math.pow(numero, 2.0);
	}
	
	public static double calcularRaizQuadrada(double numero) {
		return Math.sqrt(numero);
	}
	
	public static double arredondarNumero(double numero) {
		return Math.round(numero);
	}
	
	public static double maiorOuMenor(double numero1, double numero2, int escolhido) {
		
		return (escolhido == 1) ? Math.max(numero1, numero2) : Math.min(numero1, numero2);
	}
	
	public static double gerarNumero() {
		return Math.round(Math.random() * 100);
	}
	
}
