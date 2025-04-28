package exercicio04;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Chamando a fun��o com 100 lan�amentos e contando o n�mero 6
		sequenciaDados(100, 6);

	}
	
	/**
     * Fun��o que realiza o processamento de lan�amentos de dados.
     * 
     * @param totalLancamentos N�mero total de lan�amentos a serem simulados.
     * @param numeroParaContar O n�mero que ser� contado nas simula��es.
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
		System.out.printf("\nO n�mero %d apareceu %d vezes em %d lan�amentos.%n", numeroParaContar, contadorNumeroSeis, totalLancamentos);
	}
	
}
