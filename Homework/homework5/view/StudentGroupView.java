package view;

import java.util.List;
import java.util.Scanner;

import model.impl.Teacher;
import controller.StudentController;
import service.StudentGroupService;
import controller.StudentGroupController;
import controller.TeacherController;
import model.DB.DataBase;
import model.impl.Student;

public class StudentGroupView {
    private StudentController controller = new StudentController();
    private TeacherController teacherController = new TeacherController();
    private StudentGroupController groupController = new StudentGroupController();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - создать учителя");
            System.out.println("5 - создать учебную группу");
            System.out.println("6 - распечатать учебную группу");            
            System.out.println("7 - выход");
            
            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();                
                case 4 -> getTeacherById();
                case 5 -> groupController.createStudentGroup(getTeacherById(), getAllStudents());
                case 6 -> groupController.getStudentGroup();
                case 7 -> System.exit(0);
            
                default -> System.out.println("Операция не поддерживается");
            }
        }

    }

    private Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию студента:");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы студента:");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(name, lastName, groupId);
        System.out.println(student);
        return student;        
    };

    private Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя учителя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию учителя:");
        String lastName = scanner.nextLine();
        System.out.println("Введите ID учителя:");
        int id = scanner.nextInt();
        Teacher teacher = teacherController.createTeacher(id, name, lastName);
        System.out.println(teacher);
        return teacher;
    }

    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private Teacher getTeacherById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id учителя: ");
        int id = scanner.nextInt();
        Teacher teacher = teacherController.getTeacherById(id);
        System.out.println(teacher);
        return teacher;
    }

    private List<Student> getAllStudents(){
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    };
}
