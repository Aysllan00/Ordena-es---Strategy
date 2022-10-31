public class OrdenarInsertSort implements Sort{

    @Override
    public double[] ordenar(double[] array) {
        int j;
        double key;
        int i;

        for (j = 1; j < array.length; j++)
        {
            key = array[j];
            for (i = j - 1; (i >= 0) && (array[i] > key); i--)
            {
                array[i + 1] = array[i];
            }
            array[i + 1] = key;
        }

        return array;
    }
}
