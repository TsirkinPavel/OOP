package controller;


import model.impl.Student;
import model.impl.Teacher;
import service.TeacherService;

public class TeacherController {

    private TeacherService service = new TeacherService();

    public Teacher createTeacher(int id, String name, String lastName) {
        return service.createTeacher(id, name, lastName);
    }
    
    public Teacher getTeacherById(int id) {

        Teacher teacher = null;
        try {
            teacher = service.getTeacherById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }
}