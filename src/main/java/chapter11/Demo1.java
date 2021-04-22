package chapter11;

import java.util.*;

/***
 * List接口的使用
 */
public class Demo1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("苹果");
        list.add("小米");
        list.add(0,"华为");
        System.out.println(list.toString());
        list.remove("坚果");
        list.remove(0);
        System.out.println(list);
        System.out.println(list.toString());

        for (Object obj :
                list) {
            System.out.println(obj);
        }
        Iterator iterator = list.iterator();
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        System.out.println(list.indexOf("苹果"));

    }
}
