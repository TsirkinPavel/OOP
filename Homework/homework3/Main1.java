package Homework.homework3;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import Homework.homework3.StudentGroup;
import Homework.homework3.StudentGroupIterator;



public class Main1 {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup("P-12634");

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);


        studentGroup.addStudent(van);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);

        StudentGroup studentGroup1 = new StudentGroup("P-12634");
        StudentGroup studentGroup2 = new StudentGroup("T-12635");
        StudentGroup studentGroup3 = new StudentGroup("T-12636");
        StudentGroup studentGroup4 = new StudentGroup("A-12637");
        StudentGroup studentGroup5 = new StudentGroup("A-12638");
        StudentGroup studentGroup6 = new StudentGroup("A-12639");
           
        
        Stream Programmers = new Stream();
        Stream Testers = new Stream();
        Stream Analitics = new Stream();

        Programmers.addGroups(studentGroup1);
        Testers.addGroups(studentGroup2);
        Testers.addGroups(studentGroup3);
        Analitics.addGroups(studentGroup4);
        Analitics.addGroups(studentGroup5);
        Analitics.addGroups(studentGroup6);

        System.out.println("Programmers: " + Programmers);
        System.out.println("Testers: " + Testers);
        System.out.println("Analitics: " + Analitics);
        
        ArrayList<Stream> arrayList = new ArrayList<Stream>(List.of(Analitics, Programmers, Testers ));
        System.out.println(arrayList);

        Collections.sort(arrayList, new StreamComparator());

        System.out.println(arrayList);
    }

}