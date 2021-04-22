package chapter12;
import chapter11.Student;

import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 18);
        Student s3 = new Student("梁朝伟", 12);
        list.add(s1);
        list.add(s2);
        list.add(s3);
    }
}
