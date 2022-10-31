public class OrdenarQuickSort implements Sort{

    int inicio;
    int fim;

    @Override
    public double[] ordenar(double[] array) {
        inicio = 0;
        fim = array.length - 1;

        quickSort(array, inicio, fim);

        return array;
    }

    private void quickSort(double[] vetor, int inicio, int fim) {
        if(fim > inicio) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividir(vetor, inicio, fim);
      /* Chamada recursiva para redivisao do vetor de elementos menores
        que o pivô. */
            quickSort(vetor, inicio, indexPivo - 1);
      /* Chamada recursiva para redivisao do vetor de elementos maiores
        que o pivô. */
            quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private int dividir(double[] vetor, int inicio, int fim) {
        int pontEsq, pontDir = fim;
        double pivo = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {
      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        ou ate que o elemento em questão seja menor que o pivô. */
            while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        que o elemento em questão seja maior que o pivô. */
            while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

      /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
        menores e maiores que o pivô foram localizados em ambos os lados.
        Trocar estes elementos de lado. */
            if(pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocar(double[] vetor, int i, int j) {
        double temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    /*
    int sum = 0;
    int inicio;
    int fim;

    @Override
    public double[] ordenar(double[] array) {
        if(sum == 0){
            inicio = 0;
            fim = array.length - 1;
            sum++;
        }
        if (inicio < fim) {
            int posicaoPivo = separar(array, inicio, fim);
            fim = posicaoPivo - 1;
            ordenar(array);
            inicio = posicaoPivo + 1;
            ordenar(array);
        }
        return array;
    }

    private static int separar(double[] array, int inicio, int fim) {
        double pivo = array[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (array[i] <= pivo)
                i++;
            else if (pivo < array[f])
                f--;
            else {
                double troca = array[i];
                array[i] = array[f];
                array[f] = troca;
                i++;
                f--;
            }
        }
        array[inicio] = array[f];
        array[f] = pivo;
        return f;
    }

     */
}
