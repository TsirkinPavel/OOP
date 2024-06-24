package Homework.homework6;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister(user);
        Reporter reporter = new Reporter(user);
        reporter.report();
        persister.save();
    }
}