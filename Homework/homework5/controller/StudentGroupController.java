package controller;

import java.util.List;

import model.impl.Student;
import model.impl.StudentGroup;
import model.impl.Teacher;
import service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService groupService = new StudentGroupService();

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        
    }

    public StudentGroup getStudentGroup() {
        return groupService.getStudentGroup();
    } 

}
