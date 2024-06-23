package service;

import java.util.ArrayList;
import java.util.List;

import model.DB.DataBase;
import model.impl.Teacher;
import view.TeacherView;

public class TeacherService extends TeacherView{

    private final List<Integer> groups = new ArrayList<>();

    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

     public Teacher getTeacherById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB
                .stream()                
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher == null) {
            throw new Exception("Учитель не найден");
        }
        return teacher;
    }
    
    public void createOnConsole(List<Teacher> teachers) {
        sendOnConsole(teachers);

    }
}
