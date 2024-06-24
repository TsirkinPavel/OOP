package dip1;
/*- Dependency inversion principle
Принцип инверсии зависимостей
    - модули высокого уровня не должны зависеть
    от модулей нижнего уровня.
    И те, и другие должны зависеть от абстракций.
    - абстракции не должны зависеть от деталей.
    Детали должны зависеть от абстракций.
    
    Здесь модуль более высокого уровня Report содержал метод output и зависел от модуля более низкого уровня ReportPrinter, поэтому мы создали абстрактный класс PrintOut и класс ReportService который используя классы Report и наследников от PrintOut разных методов вывода(на консоль и на принтер) реализует вывод на печать разными способами.
    */
import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.ReportService;
import dip1.model.util.ReportConsole;
import dip1.model.util.ReportPrinter;
import logger.Log;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    //private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        //log.log(Level.INFO, "Method main in model package started");
        Report report = new Report(List.of(new ReportItem("item1", 12.5f), new ReportItem("item2", 12.6f)));
        ReportService service = new ReportService(report, new ReportConsole());
        ReportService service2 = new ReportService(report, new ReportPrinter());
        service.output();
        service2.output();
    }
}
