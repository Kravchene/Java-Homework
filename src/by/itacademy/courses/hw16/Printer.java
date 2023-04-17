package by.itacademy.courses.hw16;

public class Printer {
    public static void mainMenu() {
        System.out.println();
        System.out.println("*** Для регистрации нажмите : 1 ***");
        System.out.println("*** Для авторизации нажмите: 2 ***");
        System.out.println("*** Чтобы получить всех пользователей зарегистрированных за промежуток времени: 3 ***");
        System.out.println("*** Для выхода нажмите : 4  ***");
        System.out.print("*** поле для ввода :");
    }

    public static void registration() {
        System.out.println();
        System.out.println("*** Добро пожаловать в раздел регистрация ***");
        System.out.println("*** Для регистрации вам нужно создать логин и пароль ***");
        System.out.println("*** Логин должен содержать только латинские буквы, цифры и знак подчеркивания. Длина должна быть от 5 до 20 символов ***");
    }

    public static void creatingPassword() {
        System.out.println();
        System.out.println("Осталось создать пароль");
        System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания. Длина от 8 символов.");
    }

    public static void userAuthorization() {
        System.out.println();
        System.out.println("*** добро пожаловать в раздел авторизация ***");
        System.out.println("*** Для авторизации введите логин и пароль ***");
    }

    public static void loginToTheMainPage() {
        System.out.println("Пользователь найден можете зайти на главную страницу сайта");
        System.out.println("*** Главная страница сайта ***");
    }

    public static void exit() {
        System.out.println();
        System.out.println("Вы решили выйти с сайта!");
        System.out.println("***выход***");
    }

    public static void error() {
        System.out.println("Ошибка вы ввели неверное значение");
        System.out.println("Надо ввести значение от 1 до 3");
        System.out.println("********************************");
    }

    public static void defaultCase() {
        System.out.println("Ошибка попробуй снова ввести значение от 1 до 3");
    }

    void hello() {
        System.out.println("*** Добро пожаловать на самый лучший сайт ***");
    }
}
