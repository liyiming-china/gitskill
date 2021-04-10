public class Cal {
    public int compute(int i, int i1, String c) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computable compute = ComputerFactory.getCompute(c);
        return compute.compute(i, i1);

    }
}
