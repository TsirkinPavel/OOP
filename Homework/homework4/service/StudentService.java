package Homework.homework4.service;

import java.util.List;

import Homework.homework4.model.Student;
import Homework.homework4.view.StudentView;

public class StudentService extends StudentView{

    public Student createStudent(int id, String name, String lastName) {
        return new Student(id, name, lastName);
    }

    
    public void createOnConsole(List<Student> students) {
        sendOnConsole(students);

    }
}
