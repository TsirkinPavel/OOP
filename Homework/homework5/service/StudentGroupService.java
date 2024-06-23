package service;

import model.impl.Student;
import model.impl.StudentGroup;
import model.impl.Teacher;


import java.util.List;




public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
        
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }    

    
}
