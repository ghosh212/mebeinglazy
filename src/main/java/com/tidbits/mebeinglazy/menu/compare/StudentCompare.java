package com.tidbits.mebeinglazy.menu.compare;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCompare implements Comparable<Student>{

    @Autowired
    Student student;


    public static void main(String[] args) {
        Student ob = new Student("Debo",1,3, "XI");
        Student ob1 = new Student("Anirjeet",2,9, "XI");
        Student ob2 = new Student("Saif",3,5, "XI");
        Student ob3 = new Student("Puja",4,1, "XI");
        List<Student> sList = new ArrayList<>();
        sList.add(ob);
        sList.add(ob1);
        sList.add(ob2);
        sList.add(ob3);
        StudentCompare scom = new StudentCompare();
      //  Collections.sort(sList,scom);
    }


    @Override
    public int compareTo(Student ob) {
        return Integer.compare(getRank(), ob.getRank());

    }

    private int getRank() {
       return student.getRank();
    }
}
