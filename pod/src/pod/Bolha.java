package pod;

public class Bolha {
	
	
	
	
	public int [] troca (int [] vetor, int j){
		
		int aux    = vetor[j];
		vetor[j]   = vetor[j+1];
		vetor[j+1] = aux;
		
		return vetor;
	} 
	
	
	
	public int[] bolhaCrescente (int[] vetor) {
	
	 for (int i = 0; i<(vetor.length); i++){
		
		for (int j=0 ;j<(vetor.length -1); j++) {
			
			if (vetor[j] > vetor[j+1]) {
				
				troca(vetor,j); 
			}
			
	    }  		
		
	  }
	 
	  return vetor;
	}
	
	
	public int [] bolhaDecrescente (int[] vetor) {
		
		 for (int i = 0; i<(vetor.length); i++){
			
			for (int j=0 ;j<(vetor.length -1); j++) {
				
				if (vetor[j] < vetor[j+1]) {
					
					troca(vetor,j); 
				}
				
		    }  		
			
		  }
		return vetor;
	}
		
		
	
	
	
	
	public int[] bolhacomFlagCrescente (int[] vetor) {
		boolean flag ;
		
		 for (int i = 0; i<(vetor.length); i++){
			 flag = false;
			 
			for (int j=0 ;j<(vetor.length -1); j++) {
				
				if (vetor[j] > vetor[j+1]) {
					
					troca(vetor,j);
					flag = true;
				}
				
		    } 
			
		if (flag==false){
				return vetor;
		    }  		
			
		}
		   
		return vetor;
		   
	}
	
	public int[] bolhaComFlagDecrescente (int[] vetor) {
		boolean flag ;
		
		 for (int i = 0; i<(vetor.length); i++){
			 flag = false;
			 
			for (int j=0 ;j<(vetor.length -1); j++) {
				
				if (vetor[j] < vetor[j+1]) {
					
					troca(vetor,j);
					flag = true;
				}
				
		    } 
			
		if (flag==false){
				return vetor;
		    }  		
			
		}
		   
		return vetor;
		   
	}
	
	
	
	
	
	//Mostra o valor de cada de posição da variavel vetor	
	public void mostra(int[] vetor){
 
				for ( int i=0; i< vetor.length;i++){
					
					System.out.println("O valor da posição "+ (i+1) + "ª é igual a: "+ vetor[i]);
					
				}    	
		
		
	}
	
	public void mostraordenacaobolha(int[] vetor) {
	 
       	System.out.println("Valores Ordenados");
	
	    for (int i=0;i<vetor.length; i++) {
	       System.out.println(" " + vetor[i]);	
		
	    }

	 
	}	
}
