package pod;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Pod {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        List<Integer> multiplicadores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

/*        System.out.println("****** BOLHA ******");

        System.out.println("****** Vetor Aleat�rio ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }
            
        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        System.out.println("****** BOLHA ******");

        System.out.println("****** Vetor Crescente ******");

        
        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }
*/
/*        System.out.println("****** BOLHA ******");

        System.out.println("****** Vetor Decrescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

     for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolha(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        System.out.println("****** BOLHA C/ FLAG ******");

        System.out.println("****** Vetor Aleat�rio ******");

/*      for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

/*        System.out.println("****** BOLHA C/ FLAG ******");

        System.out.println("****** Vetor Crescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
       }

      for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        System.out.println("****** BOLHA C/ FLAG ******");

        System.out.println("****** Vetor Decrescente ******");

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.bolhaComFlag(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

*/       System.out.println("****** INSERCAO ******");

        System.out.println("****** Vetor Aleat�rio ******");

 /*       for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Inser��o Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Inser��o Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

 */      for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Inser��o Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        /*System.out.println("****** INSERCAO ******");

        System.out.println("****** Vetor Crescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Inser��o Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Inser��o Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Inser��o Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        System.out.println("****** INSERCAO ******");

        System.out.println("****** Vetor Decrescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.insercao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Bolha c/ Flag Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }*/
/*
        System.out.println("****** SELECAO ******");

        System.out.println("****** Vetor Aleat�rio ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorAleatorio(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Aleat�rio com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }
*/
        /*System.out.println("****** SELECAO ******");

        System.out.println("****** Vetor Crescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorCrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Crescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        System.out.println("****** SELECAO ******");

        System.out.println("****** Vetor Decrescente ******");

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(1000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(10000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }

        for (int multiplicador : multiplicadores) {
            int[] vetor = Vetor.getVetorDecrescente(100000 * multiplicador);
            Instant inicio = Instant.now();
            ordenador.selecao(vetor);
            Instant fim = Instant.now();
            Long tempoTotal = Temporizador.calculaTempoTotal(inicio, fim);
            System.out.println("Tempo total Sele��o Decrescente com " + vetor.length + " elementos: " + tempoTotal + "ms");
        }*/
    }
}


