package Homework.homework6;

public class Reporter{
    private final User user;

    public Reporter(User user){
        this.user = user;
    }
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
