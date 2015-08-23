package pod;

public class Selecao {



    int [] troca (int [] vetor, int i, int a){
    
    	int aux = vetor[a];
		vetor[a] = vetor[i];
		vetor[i] = aux;
		
    	return vetor;
    }
	
	
	
	public int [] selecaoCrescente (int[] vetor) {
    	
    	int i, a;
    	
    	for (i=0; i < (vetor.length - 2); i++){
    		a=i;
    		int j = i+1;
    		while (  (j < vetor.length -1) && (vetor[a]> vetor[j])  ){
    			
    			a = j;
    			j++;  			   			
    			
    		}
    		
    		if (a!=i){
  			  
		      troca(vetor,i,a);		  			  			    				
			
    		}
    		
    	}
    	
    	return vetor;
    }

   public int [] selecaoDrescente (int[] vetor) {
    	
    	int i, a;
    	
    	for (i=0; i < (vetor.length - 2); i++){
    		a=i;
    		int j = i+1;
    		while (  (j < vetor.length -1) && (vetor[a]< vetor[j])  ){
    			
    			a = j;
    			j++;  			   			
    			
    		}
    		
    		if (a!=i){
  			  
		      troca(vetor,i,a);		  			  			    				
			
    		}
    		
    	}
    	
    	return vetor;
    }
}
