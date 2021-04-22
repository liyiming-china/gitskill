package chapter12;

import java.util.Enumeration;
import java.util.Vector;

public class Demo1 {
    public static void main(String[] args) {
        Vector<Object> vec = new Vector<>();
        vec.add("草莓");
        vec.add("芒果");
        vec.add("西瓜");
        System.out.println(vec.size());
        vec.remove("西瓜");
//        vec.clear();

        Enumeration<Object> elements = vec.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

//        vec.firstElement();
//        vec.lastElement();
//        vec.elementAt(1);

    }
}
