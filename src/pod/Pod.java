package pod;

import java.util.Scanner;

public class Pod {
	private static Scanner teclado;

	public static void main(String[] args){
		int posicoes;
		int[] vetor;
		int i;
		teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de posições:");
		posicoes = teclado.nextInt();
		vetor = new int[posicoes] ;
		System.out.println("A quantidade de posicoes do vetor é :" + posicoes );
		
		for (i=0; i<posicoes; i++) {
			System.out.println("Informe o valor da posicao "+ (i+1) +" :");
			vetor[i] = teclado.nextInt();
			
		}
		
		
	   	
	   //Bolha bolha = new Bolha();
	   //bolha.mostra(vetor);
	   Insercao insercao = new Insercao();
	   //bolha.troca(vetor);
	   insercao.mostra(vetor);
	   //insercao.insercaoCrescente(vetor);
	   insercao.insercaoDecrescente(vetor);
	   
	   insercao.mostraordenacaoInsercao(vetor);
		
	}

}


