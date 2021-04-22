import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.size());
        System.out.println(list.toString());

        list.remove((Integer) 20);
        System.out.println(list.toString());

        System.out.println(list.subList(1, 3));
    }
}
