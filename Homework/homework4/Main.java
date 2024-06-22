package Homework.homework4;

import Homework.homework4.controller.StudentController;
import Homework.homework4.controller.StudentGroupController;
import Homework.homework4.model.Student;
import Homework.homework4.service.StudentGroupService;

import java.util.List;

import Homework.homework3.StudentGroup;

public class Main {

    public static void main(String[] args) {
       
        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Ira", "Ivanova")));

    }

}
