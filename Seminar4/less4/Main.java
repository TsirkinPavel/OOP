package less4;

import less4.controller.StudentController;
import less4.controller.StudentGroupController;
import less4.model.Student;
import less4.service.StudentGroupService;

import java.util.List;

import Homework.homework3.StudentGroup;

public class Main {

    public static void main(String[] args) {
        // StudentGroup group = new StudentGroup("1 Group");
        // StudentGroupService sgservice = new StudentGroupService(group);
        // StudentGroupController sgcontr =  new StudentGroupController(sgservice);
        // sgcontr.addStudent(new Student(1,"Poul" , "Tsirkin"));
      

        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Ira", "Ivanova")));

    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
