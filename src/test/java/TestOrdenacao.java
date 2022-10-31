import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOrdenacao {

    ConjuntoOrdenacoes conjuntoOrdenacoes;

    @Test
    public void testeOrdenarBubbleSort(){
        conjuntoOrdenacoes = new OpcaoBubbleSort();

        assertTrue(conjuntoOrdenacoes.getSort() instanceof OrdenarBubbleSort);
    }

    @Test
    public void testeOrdenarBubbleSortArray(){
        conjuntoOrdenacoes = new OpcaoBubbleSort();

        double [] arr1 = new double [] {7, 6, 4, 3, 1};
        double [] arr2 = new double [] {1, 3, 4, 6, 7};

        double[] array = conjuntoOrdenacoes.ordenar(arr1);
        assertTrue(Arrays.equals(array, arr2));
    }

    @Test
    public void testeOrdenarInsertSort(){
        conjuntoOrdenacoes = new OpcaoInsertSort();

        assertTrue(conjuntoOrdenacoes.getSort() instanceof OrdenarInsertSort);
    }

    @Test
    public void testeOrdenarInsertSortArray(){
        conjuntoOrdenacoes = new OpcaoInsertSort();

        double [] arr1 = new double [] {7, 6, 4, 3, 1};
        double [] arr2 = new double [] {1, 3, 4, 6, 7};

        double[] array = conjuntoOrdenacoes.ordenar(arr1);
        System.out.println(java.util.Arrays.toString(array));
        System.out.println(java.util.Arrays.toString(arr2));
        assertTrue(Arrays.equals(array, arr2));
    }

    @Test
    public void testeOrdenarQuickSort(){
        conjuntoOrdenacoes = new OpcaoQuickSort();

        assertTrue(conjuntoOrdenacoes.getSort() instanceof OrdenarQuickSort);
    }

    @Test
    public void testeOrdenarQuickSortArray(){
        conjuntoOrdenacoes = new OpcaoQuickSort();

        double [] arr1 = new double [] {7, 6, 4, 3, 1};
        double [] arr2 = new double [] {1, 3, 4, 6, 7};
        double[] array = conjuntoOrdenacoes.ordenar(arr1);

        assertTrue(Arrays.equals(array, arr2));
    }
}
