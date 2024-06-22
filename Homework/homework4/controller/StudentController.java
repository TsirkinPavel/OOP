package Homework.homework4.controller;

import Homework.homework4.model.Student;
import Homework.homework4.model.User;
import Homework.homework4.service.StudentService;


import java.util.List;

public class StudentController implements UserController {

    StudentService viewStudents = new StudentService();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Student> students) {
        viewStudents.createOnConsole(students);
    }

}
