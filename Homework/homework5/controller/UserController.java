package controller;

import model.User;


public interface UserController<T extends User>{
    void create(String name, String lastName);
}
