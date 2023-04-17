package by.itacademy.courses.hw8.Task3.Enum;

public enum ClothingSize {
    SIZE_20(20),
    SIZE_32(32),
    SIZE_52(52),
    SIZE_55(55),
    SIZE_60(60),
    SIZE_70(70);


    private Integer clothingSize;

    ClothingSize(Integer clothingSize) {
        this.clothingSize = clothingSize;
    }

    public Integer getClothingSize() {
        return clothingSize;
    }
}
