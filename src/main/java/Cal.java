public class Cal {
    public int compute(int i, int i1, char c) {
        switch (c){
            case '+':
                return i+i1;
            case '-':
                return i-i1;
            default:
                throw new IllegalArgumentException();
        }

    }
}
