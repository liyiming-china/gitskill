package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Student s1 = new Student("张三",10);
        Student s2 = new Student("李四", 11);
        Student s3 = new Student("王五", 12);
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println(collection.size());
        System.out.println(collection);
//        collection.remove(s1);
        collection.remove(new Student("张三",10));
        System.out.println(collection);
        for (Object obk :
                collection) {
            System.out.println(obk.toString());
            
        }

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

}
