package pod;



public class Ordenador {

    public int[] bolha(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j);
                }
            }
        }
        return vetor;
    }

    public int[] bolhaComFlag(int[] vetor) {
        boolean flag;

        for (int i = 0; i < (vetor.length); i++) {
            flag = false;

            for (int j = 0; j < (vetor.length - 1); j++) {

                if (vetor[j] > vetor[j + 1]) {

                    troca(vetor, j);
                    flag = true;
                }

            }

            if (!flag) {
                return vetor;
            }

        }

        return vetor;

    }

    public int[] selecao(int[] vetor) {

        int i, a;

        for (i = 0; i < (vetor.length -1 ); i++) {
            a = i;
            int j ;
            for (j = a + 1;(j < vetor.length) ;j++) {
                 if (vetor[a] > vetor[j])
                  a = j;
                

            }

            if (a != i) {

                troca(vetor, i, a);

            }

        }

        return vetor;
    }

    
    public int[] insercao(int[] vetor) {

        int i, j;

        for (i = 0; i < vetor.length; i++) {

            j = i;
            
            if (j>=vetor.length) 
            	 break;
            
            while (j > 0 &&  vetor[j] > vetor[j + 1]) {

                troca(vetor, j);
                j--;
            }


        }
        return vetor;

    }

    
    //ordenação concha ou shell sort
    public int [] concha( int [] vetor) {
    	
    	int salto,i,j,k;
    	salto = vetor.length/2;
    	
    	while (salto>0) {
    		for (i = salto; i< vetor.length; i++) {
    			j = i - salto;
    			while (j>=0){
    				
    				k = j + salto;
    				if (vetor[j]<=vetor[k]){
    					j=-1;
    					
    				} else {
    					
    					troca(vetor,j);
    					j-=salto; // j = j-salto
    				}
    			}
    		}
    		
    		salto/=2;
    	}
    	
    	
    	
    	return vetor;
    }
   
   
    public int[] combina( int [] vetor, int inicio, int meio, int fim ) {
    	
    	int [] v1 = new int [meio - inicio];
    	int [] v2 = new int [meio +1 - fim];
    	
    	for (int i =0; i < v1.length; i++ ){
    		
    		v1[i] = vetor[inicio +i];
    	}
         
    	for (int i =0; i < v2.length -1; i++ ){
    		
    		v2[i] = vetor[meio +1 +i];
    	}    	
    	
    	int i = 0;
    	int j = 0;
    	
    	for (int k = inicio; k <= fim; k++){
    		
    		if (i < v1.length && j < v2.length){
    			
    			if (v1[i] < v2[j]) {
    				vetor[k] = v1[i++];
    				
    			} else {
    				vetor[k] = v2[j++];
    			}
    		} else if( i < v1.length) {
    			
    			    vetor[k] = v1[i++];
    		}
              else if( j < v2.length) {
    			  
            	  vetor[k] = v2[j++];
    			
    		}
    	}
    	
    	return vetor;
    }
    
    
   public int [] mergesort (int [] vetor, int inicio, int fim ) {
	   
	   if (inicio < fim) {
		   return vetor;
	   }   
	   
	   int meio = (fim - inicio)/2;
	   mergesort(vetor, inicio, meio);
	   mergesort(vetor,meio +1,fim);
	   combina(vetor,inicio,meio,fim);
	    
	   
	   return vetor; 
   }    
    
    
    
    public int[] troca(int[] vetor, int j) {

        int aux = vetor[j];
        vetor[j] = vetor[j + 1];
        vetor[j + 1] = aux;

        return vetor;
    }

    int[] troca(int[] vetor, int i, int a) {

        int aux = vetor[a];
        vetor[a] = vetor[i];
        vetor[i] = aux;

        return vetor;
    }
}
