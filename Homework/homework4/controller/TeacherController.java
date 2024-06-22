package Homework.homework4.controller;

import Homework.homework4.model.Student;
import Homework.homework4.model.Teacher;
import Homework.homework4.model.User;
import Homework.homework4.service.StudentGroupService;
import Homework.homework4.service.TeacherService;


import java.util.List;

public class TeacherController implements UserController {

    TeacherService viewTeachers = new TeacherService();
    

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Teacher> teachers) {
        viewTeachers.createOnConsole(teachers);
    }

    

}
