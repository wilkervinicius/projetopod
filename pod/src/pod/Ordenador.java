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

        for (i = 0; i < (vetor.length - 2); i++) {
            a = i;
            int j = i + 1;
            while ((j < vetor.length - 1) && (vetor[a] > vetor[j])) {

                a = j;
                j++;

            }

            if (a != i) {

                troca(vetor, i, a);

            }

        }

        return vetor;
    }

    public int[] insercao(int[] vetor) {

        int i, j;

        for (i = 1; i < vetor.length; i++) {

            j = i;
            while (j > 0 && vetor[j - 1] > vetor[j]) {

               int aux = vetor[j-1];
               vetor[j-1] = vetor[j];
               vetor[j] = aux;
                j--;
            }


        }
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
