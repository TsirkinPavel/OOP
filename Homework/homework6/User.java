package Homework.homework6;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
     * public void save(){
     * Persister persister = new Persister(this);
     * persister.save();
     * }
     * Здесь User зависел от Persister нарушен принцип инверсии зависимости. В Main
     * шло обращение к юзеру, а не к классам, которые должны что-то делать с именем.
     * Также в этом классе были лишние методы которые нарушают принцип единственной
     * ответственности для User
     * метод report вынесен в отдельный класс Reporter также по принципу
     * единственной ответственности
     * 
     * 
     */

}
