package exercicio03;

import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main(String[] args) { //Calcular o quadrado de um n�mero qualquer
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero qualquer: ");
		double numero = sc.nextDouble();
		
		System.out.printf("O quadrado do n�mero �: %.2f", Math.pow(numero, 2.0));
		
		sc.close();
	}

}
