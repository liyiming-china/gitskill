import java.util.ArrayList;
import java.util.List;

class Demo{
    static class Fruit{};
    static class Apple extends Fruit{};
    static class BigApple extends Apple{};
    public static void main(String[] args) {
        List<? super Apple> list = new ArrayList<>();
        list.add(new BigApple());
        list.add(new Apple());
    }
}


