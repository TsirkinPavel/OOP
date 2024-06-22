package Homework.homework4.view;
import Homework.homework4.model.User;

import java.util.List;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);

}
