package pod;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Pod {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        List<Integer> multiplicadores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

/*       System.out.println("****** BOLHA ******");

        System.out.println("****** Vetor Aleatório ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }
            
        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        System.out.println("****** BOLHA ******");

        System.out.println("****** Vetor Crescente ******");

        
        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

       for (int multiplicador : multiplicadores) {
           int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        System.out.println("****** BOLHA ******");

        System.out.println("****** Vetor Decrescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

     for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }
        
        
/*        System.out.println("****** BOLHA C/ FLAG ******");

        System.out.println("****** Vetor Aleatório ******");

     for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

     System.out.println("****** BOLHA C/ FLAG ******");

        System.out.println("****** Vetor Crescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
       }

      for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

      System.out.println("****** BOLHA C/ FLAG ******");

        System.out.println("****** Vetor Decrescente ******");

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

  /*    System.out.println("****** INSERCAO ******");

        System.out.println("****** Vetor Aleatório ******");

          for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

     for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

     System.out.println("****** INSERCAO ******");

        System.out.println("****** Vetor Crescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }


        System.out.println("****** INSERCAO ******");

        System.out.println("****** Vetor Decrescente ******");

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

  /*     System.out.println("****** SELECAO ******");

        System.out.println("****** Vetor Aleatório ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

    System.out.println("****** SELECAO ******");

        System.out.println("****** Vetor Crescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

   /*   System.out.println("****** SELECAO ******");

        System.out.println("****** Vetor Decrescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

      for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
             System.out.println("" + vetor.length + ";" + tempoTotal  );
        }

      for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
             System.out.println("" + vetor.length + ";" + tempoTotal  );
        }
 
 
 System.out.println("****** SHELL ******");

 System.out.println("****** Vetor Aleatório ******");

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }
     
 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

/* System.out.println("****** SHELL******");

   System.out.println("****** Vetor Crescente ******");

 
   for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

  for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

  System.out.println("****** SHELL ******");

 System.out.println("****** Vetor Decrescente ******");

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
     Instant inicio = Instant.now();
     ordenador.concha(vetor);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }


/* 
 System.out.println("****** MERGESORT ******");

 System.out.println("****** Vetor Aleatório ******");

/* for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }
     
  for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 /*System.out.println("****** MERGESORT******");

 System.out.println("****** Vetor Crescente ******");

 
 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

      System.out.println("****** MERGESORT******");

 System.out.println("****** Vetor Decrescente ******");

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.mergesort(vetor, i, f);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }


 
/* System.out.println("****** QUICKSORT ******");

 System.out.println("****** Vetor Aleatório ******");

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }
     
  for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 System.out.println("****** QUICKSORT******");

 System.out.println("****** Vetor Crescente ******");

 
 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

     System.out.println("****** QUICKSORT******");

 System.out.println("****** Vetor Decrescente ******");

 for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
     
 }

/* for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

for (int multiplicador : multiplicadores) {
     int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
     Instant inicio = Instant.now();
     int i = 0;
     int f = vetor.length; 
     ordenador.quicksort(vetor, i, f-1);
     Instant fim = Instant.now();
     Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
     System.out.println("" + vetor.length + ";" + tempoTotal  );
 }

*/
 
    }
}


