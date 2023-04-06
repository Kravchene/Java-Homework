package by.itacademy.courses.hw11;

import by.itacademy.courses.hw11.CaseLogic.CaseLogic;
import by.itacademy.courses.hw11.Exception.WrongLoginException;

public class TheBestWebsite {
    public static void main(String[] args) throws WrongLoginException {
        CaseLogic logic = new CaseLogic();
        Printer printer = new Printer();
        printer.hello();
        logic.caseLogic();
    }
}
