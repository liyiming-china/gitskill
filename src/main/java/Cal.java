public class Cal {
    public int compute(int i, int i1, char c) {
        Computable compute = ComputerFactory.getCompute(c);
        return compute.compute(i, i1);

    }
}
