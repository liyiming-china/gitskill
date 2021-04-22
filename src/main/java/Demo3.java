import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/***
 *  collection的使用
 */
public class Demo3{
    public static void main(String[] args) {
        Collection collect = new ArrayList<>();
        collect.add("苹果");
        collect.add("西瓜");
        collect.add("榴莲");
        System.out.println(collect.size());
        System.out.println(collect);
//        collect.remove("榴莲");
//        System.out.println(collect.size());
//        System.out.println(collect);
        for (Object ob :
                collect) {
            System.out.println(ob);
        }
        Iterator iterator = collect.iterator();
        for (Iterator it = iterator; it.hasNext(); ) {
            String object = (String)it.next();
            System.out.println(object);
            iterator.remove();
        }
        System.out.println(collect.size());
        iterator = collect.iterator();
        for (Iterator it = iterator; it.hasNext(); ) {
            Object object = it.next();
            System.out.println(object);

        }

        System.out.println(collect.contains("西瓜"));
        System.out.println(collect.isEmpty());
    }
}
