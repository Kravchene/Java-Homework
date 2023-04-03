package by.itacademy.courses.hw8.Task3.Enum;

public enum ClothingProtectionClass {
    COLD_PROTECTION_LEVEL1("-9.7"),
    COLD_PROTECTION_LEVEL2("-18"),
    COLD_PROTECTION_LEVEL3("-41"),
    COLD_PROTECTION_LEVEL4("-28"),
    WATER_PROTECTION_LEVEL1("20%"),
    WATER_PROTECTION_LEVEL2("20-50%"),
    WATER_PROTECTION_LEVEL3("50-80%"),
    WATER_PROTECTION_LEVEL4("Выше 80%");

    private String level;

    ClothingProtectionClass(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }
}
