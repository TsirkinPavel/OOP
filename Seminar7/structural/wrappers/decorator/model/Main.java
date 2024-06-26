package Seminar7.structural.wrappers.decorator.model;

import Seminar7.structural.wrappers.decorator.loging.impl.ConsoleLogger;
import Seminar7.structural.wrappers.decorator.loging.impl.LoggedCalculator;
import Seminar7.structural.wrappers.decorator.model.impl.Calculator;
import Seminar7.structural.wrappers.decorator.model.impl.ComplexCalc;

/**
  Task: You'll need to add logging to calculator's methods. Calculator's class must stay without any changes.
  Additional task: replace condition branching in to View class prepare() method with Map
 */
public class Main {
    public static void main(String[] args) {
        View view = new View(new LoggedCalculator(new ComplexCalc(), new ConsoleLogger()));
        view.run(); 
    }
}

