package Homework.homework4.controller;

import Homework.homework4.model.User;

public interface UserController {
    <T extends User> User create(T user);


}
