package Homework.homework4.service;

import java.util.List;

import Homework.homework4.model.Teacher;
import Homework.homework4.view.TeacherView;

public class TeacherService extends TeacherView{

    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

    
    public void createOnConsole(List<Teacher> teachers) {
        sendOnConsole(teachers);

    }
}
