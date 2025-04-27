package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class CadastroCliente { //Cadastro de Cliente e Calculo de Credito

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("==Cadastro Bancário==");
		
		System.out.print("Nome completo: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Renda mensal: ");
		double renda = sc.nextDouble();
		
		System.out.print("Cliente vip? ");
		boolean response = sc.next().equalsIgnoreCase("Sim");
		
		double limiteCredito = 0.0;
		
		System.out.println();
		System.out.printf("Cliente: %s%n", nome);
		System.out.printf("Idade %d anos%n", idade);
		
		if(response) {
			limiteCredito = renda * 2.0;
		} else {
			limiteCredito = renda * 1.2;
		}
		
		System.out.printf("VIP: %s%n", response ? "Sim" : "Não");
		System.out.printf("Renda: R$ %.2f%n", renda);
		System.out.printf("Limite aprovado: %.2f%n", limiteCredito);
		
		sc.close();

	}

}
