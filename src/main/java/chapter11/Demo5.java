package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/***
 * ArrayList 存储结构数组，查找遍历速度快，增删速度慢
 * LinkedList
 */
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 18);
        Student s3 = new Student("梁朝伟", 12);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list.size());
        list.remove(new Student("刘德华", 20));
        System.out.println(list.size());
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        ListIterator<Object> objectListIterator = list.listIterator();
        while (objectListIterator.hasNext())
        {
            System.out.println(objectListIterator.next());
        }
        while (objectListIterator.hasPrevious())
        {
            System.out.println(objectListIterator.previous());
        }

    }
}
