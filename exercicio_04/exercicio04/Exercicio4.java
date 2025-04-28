package exercicio04;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Chamando a função com 100 lançamentos e contando o número 6
		sequenciaDados(100, 6);

	}
	
	/**
     * Função que realiza o processamento de lançamentos de dados.
     * 
     * @param totalLancamentos Número total de lançamentos a serem simulados.
     * @param numeroParaContar O número que será contado nas simulações.
     */

	public static void sequenciaDados(int totalLancamentos, int numeroParaContar) {
		int contadorNumeroSeis = 0;
		for (int i = 0; i < totalLancamentos; i++) {
			int numerosAleatorios = (int) (Math.random() * 6) + 1;
			//System.out.println(numerosAleatorios);
			if (numerosAleatorios == numeroParaContar) {
				contadorNumeroSeis++;
			}
		}
		System.out.printf("\nO número %d apareceu %d vezes em %d lançamentos.%n", numeroParaContar, contadorNumeroSeis, totalLancamentos);
	}
	
}
