package com.tidbits.mebeinglazy.menu.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getRank(), o2.getRank());
    }

    public static void main(String[] args) {
        Student ob = new Student("Debo",1,3, "XI");
        Student ob1 = new Student("Anirjeet",2,9, "XI");
        Student ob2 = new Student("Saif",3,5, "XI");
        Student ob3 = new Student("Puja",4,1, "XI");
        StudentComparator scompare = new StudentComparator();
        List<Student> sList = new ArrayList<>();
        sList.add(ob);
        sList.add(ob1);
        sList.add(ob2);
        sList.add(ob3);
        System.out.println("Before Sort");
        System.out.println(sList);
        System.out.println("After Sort");
        Collections.sort(sList, scompare);


    }
}
