package by.itacademy.courses.hw16;

import by.itacademy.courses.hw16.caseLogic.CaseLogic;
import by.itacademy.courses.hw16.exception.WrongLoginException;

public class TheBestWebsite {
    public static void main(String[] args) throws WrongLoginException {
        CaseLogic logic = new CaseLogic();
        Printer printer = new Printer();
        printer.hello();
        logic.caseLogic();
    }
}
