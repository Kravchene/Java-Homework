package by.itacademy.courses.hw8.Task3.Enum;

public enum ModelAndColor {
    COLOR1("Чёрный"),
    COLOR2("Белый"),
    COLOR3("Синий"),
    COLOR4("Хаки"),
    MODEL1("Платье"),
    MODEL2("Блузка"),
    MODEL3("Кроссовки"),
    MODEL4("Туфли"),
    MODEL5("Зимняя спецодежда");

    private String modelAndColor;

    ModelAndColor(String modelAndColor) {
        this.modelAndColor = modelAndColor;
    }

    public String getModelAndColor() {
        return modelAndColor;
    }
}
