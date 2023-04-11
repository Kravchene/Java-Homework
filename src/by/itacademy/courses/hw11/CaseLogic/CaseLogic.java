package by.itacademy.courses.hw11.caseLogic;

import by.itacademy.courses.hw11.Printer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaseLogic {
    LogicCase1 logicCase1 = new LogicCase1();
    LogicCase2 logicCase2 = new LogicCase2();

    public void caseLogic() {
        boolean exit = false;
        while (exit == false) {
            Printer.mainMenu();
            try {
                Scanner in = new Scanner(System.in);
                switch (in.nextInt()) {
                    case 1:
                        Printer.registration();
                        logicCase1.creatingLoginAndPassword();
                        break;
                    case 2:
                        Printer.userAuthorization();
                        boolean exit1 = logicCase2.check();
                        exit = exit1;
                        break;
                    case 3:
                        Printer.exit();
                        exit = true;
                        break;
                    default:
                        Printer.defaultCase();
                        break;
                }
            } catch (InputMismatchException a) {
                Printer.error();
            }
        }
    }
}
