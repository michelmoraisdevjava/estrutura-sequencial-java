package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class SistemaNotas {//Sistema de Notas Com Casting Inteligente

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// Entrada
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();

		// Processamento
		double media = (nota1 + nota2 + nota3) / 3.0;// A média como double
		double mediaArredondada = Math.ceil(media); // A média arredondada para cima
		int mediaTruncada = (int) media; // A média truncada(Sem casas decimais)

		System.out.println();

		// Saída
		System.out.printf("A média do aluno1 é: %.2f%n", media);
		System.out.printf("A média do aluno2 é: %.2f%n", mediaArredondada);
		System.out.printf("A média do aluno3 é: %d%n", mediaTruncada);

		if (media > 6.0) {
			System.out.println("Aluno APROVADO!");
		} else {
			System.out.println("Aluno em RECUPERAÇÃO!");
		}

		sc.close();

	}

}
