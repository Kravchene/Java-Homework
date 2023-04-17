package by.itacademy.courses.hw8.Task3;

public class PrintText {
    public void printTextCase1(){
        System.out.println("Вы попали в раздел одежда");
        System.out.println("Если вы ищете конкретную одежду нажмите 1");
        System.out.println("Если вам не важна модель и важен только размер и цвет то нажмите 2 мы вам подберут все возможные эксемпляры");
        System.out.println("Если вам важен только размер нажмите 3 мы вам подберут все возможные эксемпляры");
    }
    public void printTextCase2(){
        System.out.println("Вы попали в раздел обувь");
        System.out.println("Если вы ищете конкретную обувь нажмите 1");
        System.out.println("Если вам не важна модель и важен только размер и цвет то нажмите 2 мы вам подберут все возможные эксемпляры");
        System.out.println("Если вам важен только размер нажмите 3 мы вам подберут все возможные эксемпляры");
    }
    public void defaultCase(){
        System.out.println("Ошибка попробуй снова");
    }
}
