public class ComputerFactory {


    public static Computable getCompute(String symbol) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
