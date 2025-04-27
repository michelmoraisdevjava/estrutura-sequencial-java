package exercicio03;

import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main(String[] args) { //Calcular o quadrado de um número qualquer
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número qualquer: ");
		double numero = sc.nextDouble();
		
		System.out.printf("O quadrado do número é: %.2f", Math.pow(numero, 2.0));
		
		sc.close();
	}

}
