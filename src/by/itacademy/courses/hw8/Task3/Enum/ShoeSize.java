package by.itacademy.courses.hw8.Task3.Enum;

public enum ShoeSize {
    SHOE_SIZE35(35),
    SHOE_SIZE40(40),
    SHOE_SIZE41(41);

    private Integer shoeSize;

    ShoeSize(Integer shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Integer getShoeSize() {
        return shoeSize;
    }
}
