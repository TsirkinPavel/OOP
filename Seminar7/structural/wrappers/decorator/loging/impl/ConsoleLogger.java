package Seminar7.structural.wrappers.decorator.loging.impl;

import java.time.LocalDateTime;

import Seminar7.structural.wrappers.decorator.loging.Loggable;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.err.println(LocalDateTime.now() + " <--- : ---> " + message);
    }
}
