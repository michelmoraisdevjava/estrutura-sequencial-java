package desafio01;

import java.util.Locale;
import java.util.Scanner;

public class MaquinaMatematica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Programa Máquina de Matemática!");

		System.out.println();

		System.out.print("Escolha a operação desejada:\n" 
				+ "1 - Calcular potência\n" 
				+ "2 - Calcular raiz quadrada\n"
				+ "3 - Arredondar número\n" 
				+ "4 - Encontrar maior ou menor valor\n" 
				+ "5 - Gerar número aleatório\n"
				+ "0 - Sair do Programa\n");
		int escolha = sc.nextInt();

		while (escolha != 0) {

			switch (escolha) {
			case 1:
				System.out.print("\nDigite o valor desejado: ");
				double numero = sc.nextDouble();
				double potencia = Math.pow(numero, 2.0);
				System.out.printf("A potência do número %.2f é: %.2f%n", numero, potencia);
				break;
			case 2:
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				double raizQuadrada = Math.sqrt(numero);
				System.out.printf("A raiz Quadrada do número %.2f é: %.2f%n", numero, raizQuadrada);
				break;
			case 3:
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				double arrendodar = Math.round(numero);
				System.out.printf("O valor arredondado do número %.2f é %.2f%n", numero, arrendodar);
				break;
			case 4:
				System.out.print("Digite o valor desejado: ");
				numero = sc.nextDouble();
				System.out.print("Digite o segundo valor: ");
				double numero2 = sc.nextDouble();

				System.out.print("\nDigite:\n" 
								+ "1 - Para encontrar o maior valor\n" 
								+ "2 - Para encotrar o menor valor\n");
				int escolhido = sc.nextInt();
				if (escolhido == 1) {
					double maior = Math.max(numero, numero2);
					System.out.printf("O valor maior é: %.2f%n", maior);
				} else if (escolhido == 2) {
					double menor = Math.min(numero, numero2);
					System.out.printf("O valor menor é: %.2f%n", menor);
				}
				break;
			case 5:
				double valorAleatorio = Math.random();
				System.out.printf("Valor gerado aleatoriamente é: %.2f%n", valorAleatorio);
				break;
			default:
				System.out.println("Sair do Programa!");
				break;
			}
			
			System.out.print("\nEscolha a operação desejada: ");
			escolha = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("Fim do Programa!");

		sc.close();

	}

}
