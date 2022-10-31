public abstract class ConjuntoOrdenacoes {

    protected Sort sort;

    public double[] ordenar(double[] array){
        return sort.ordenar(array);
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
