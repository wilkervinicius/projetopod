package pod;

public class Insercao {
	
	// vetor = {7,2,8,5,9}
	
	// troca valor
	public int [] troca( int[] vetor, int j){
	
		
	    int aux = vetor[j-1];
	    vetor[j-1] = vetor[j];
	    vetor[j]=aux;
	
	    return vetor;
	
	
	}
	
	
	// Metodo tipo: inserção crescente
	public int [] insercaoCrescente(int [] vetor ){
		
		int i,j;
		
		for (i = 1; i < vetor.length; i++){
			
			j=i;
			while (j>0 && vetor[j-1] > vetor[j]){
			
			//criado função troca		
				troca(vetor,j);
				
				j--;
			}
			
			
		}return vetor;
		
    } 


	
     public int [] insercaoDecrescente(int [] vetor ){
		
		int i,j,a;
		
		a = vetor.length;
		for (i = a; i > 0; i--){
			
			j=i;
			while (j<a && vetor[j-1] < vetor[j]){
				
		       troca(vetor,j);	
				j++;
			}
			
			
		}return vetor;
		
	
     }
	
	
	
	//Mostra o valor de cada de posição da variavel vetor	
	public void mostra(int[] vetor){
	 
		for ( int i=0; i< vetor.length;i++){
						
			System.out.println("O valor da posição "+ (i+1) + "ª é igual a: "+ vetor[i]);
						
		}    	

		}
		
		
		public void mostraordenacaoInsercao(int[] vetor) {
			 
	       	System.out.println("Valores Ordenados Tipo Insercao");
		
		    for (int i=0;i<vetor.length; i++) {
		       System.out.println(" " + vetor[i]);	
			
		    }

		 
			
		}	
}
