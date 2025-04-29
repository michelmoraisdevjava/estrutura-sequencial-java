package desafio01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal que representa a Maquina Matematica.
 * O programa permite que o usuario escolha operacoes matematicas e obtenha resultados.
 * Operacoes disponiveis:
 * 1 - Calcular potencia
 * 2 - Calcular raiz quadrada
 * 3 - Arredondar número
 * 4 - Encontrar maior ou menor valor
 * 5 - Gerar numero aleatório
 * 0 - Encerrar o programa
 */

public class MaquinaMatematica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Programa Máquina de Matemática!");

		System.out.println();
		
		exibirMenu();// Exibe opções disponíveis ao usuário
		
		executarPrograma(sc); // Inicia o processamento da escolha do usuário
		
		sc.close();

	}
	
	/**
     * Exibe o menu com as operações disponíveis.
     */
	public static void exibirMenu() {
		System.out.println("Escolha a operação desejada:"); 
		System.out.println("1 - Calcular potência"); 
		System.out.println("2 - Calcular raiz quadrada");
		System.out.println("3 - Arredondar número"); 
		System.out.println("4 - Encontrar maior ou menor valor"); 
		System.out.println("5 - Gerar número aleatório");
		System.out.println("0 - Sair do Programa");
	}
	
	/**
     * Método para validar entrada do usuário, garantindo que seja um número inteiro.
     * @param sc Scanner utilizado para a entrada do usuário.
     * @return Um número inteiro válido digitado pelo usuário.
     */
	public static int validarEntradaInt(Scanner sc) {
		while (!sc.hasNextInt()) { // Verifica se a entrada é um número válido
	        System.out.print("Entrada inválida. Digite um número da opção: ");
	        sc.next(); // Descarta entrada inválida
	    }
		return sc.nextInt();
	}
	
	/**
     * Processa a escolha do usuário e executa a operação correspondente.
     * @param sc Scanner utilizado para capturar entrada do usuário.
     */
	public static void executarPrograma(Scanner sc) {
		int escolha;
		
		do {
			System.out.print("\nEscolha a operação desejada: ");
			escolha = validarEntradaInt(sc);
			
			if(escolha == 0) {// Caso especial: encerramento do programa
				System.out.println("Fim do Programa! Obrigado por usar!");
				break;
			}

			switch (escolha) {
			case 1:
				System.out.print("Digite o valor desejado: ");
				double numero = sc.nextDouble();
				System.out.printf("A potência do número %.2f é: %.2f%n", numero, calcularPotencia(numero));
				break;
			case 2:
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				System.out.printf("A raiz Quadrada do número %.2f é: %.2f%n", numero, calcularRaizQuadrada(numero));
				break;
			case 3:
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				System.out.printf("O valor arredondado do número %.2f é %.2f%n", numero, arredondarNumero(numero));
				break;
			case 4:
				System.out.print("Digite:\n" 
						+ "1 - Para encontrar o maior valor\n" 
						+ "2 - Para encontrar o menor valor\n");
				int escolhido;
		        do {
		            System.out.print("Escolha (1 ou 2): ");
		            while (!sc.hasNextInt()) { // Verifica se a entrada é um número válido
		                System.out.println("Entrada inválida. Digite um número inteiro (1 ou 2).");
		                sc.next(); // Descarta entrada inválida
		            }

		            escolhido = sc.nextInt();

		            if (escolhido != 1 && escolhido != 2) {
		                System.out.println("Opção inválida!");
		            }
		        } while (escolhido != 1 && escolhido != 2); // Garante entrada válida
				
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				System.out.print("Digite o segundo valor: ");
				double numero2 = sc.nextDouble();
				System.out.printf("O resultado é: %.2f%n", maiorOuMenor(numero, numero2, escolhido));
				break;
			case 5:
				System.out.printf("Valor gerado aleatoriamente é: %.2f%n", gerarNumero());
				break;
			default:
				System.out.println("Valor inválido!");
				break;
			}
			
		} while(true); // Mantém o loop ativo até que `break` seja acionado pelo caso `0`
		
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
