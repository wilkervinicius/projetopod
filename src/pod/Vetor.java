package pod;

import java.util.Random;

final class Vetor {

    public static int[] getVetorAleatorio(int tamanhoDoVetor) {
        int[] resultado = new int[tamanhoDoVetor];
        for (int i = 0; i < tamanhoDoVetor; i++) {
            resultado[i] = new Random().nextInt();
        }
        return resultado;
    }

    public static int[] getVetorCrescente(int tamanhoDoVetor) {
        int[] resultado = new int[tamanhoDoVetor];
        for (int i = 0; i < tamanhoDoVetor; i++) {
            resultado[i] = i;
        }
        return resultado;
    }

    public static int[] getVetorDecrescente(int tamanhoDoVetor) {
        int[] resultado = new int[tamanhoDoVetor];
        for (int i = tamanhoDoVetor; i < tamanhoDoVetor; i--) {
            resultado[i] = i;
        }
        return resultado;
    }
}
