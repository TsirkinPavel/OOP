package Homework.homework4.view;

import Homework.homework4.model.Teacher;

import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        Collections.sort(teachers);
        System.out.println(teachers);
    }

}
