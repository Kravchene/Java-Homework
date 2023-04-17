package by.itacademy.courses.hw8.Task3.clothingAndShoes;

public class WorkWear extends Clothes {
    private String colProtectionLevel;
    private String acidAndWaterProtectionClasses;

    public WorkWear(int size) {
        super(size);
    }

    public WorkWear(int size, String colour) {
        super(size, colour);
    }

    public WorkWear(String model, int size, String colour) {
        super(model, size, colour);
    }

    public WorkWear(String model, int size, String colour, String colProtectionLevel, String acidAndWaterProtectionClasses) {
        super(model, size, colour);
        this.acidAndWaterProtectionClasses = acidAndWaterProtectionClasses;
        this.colProtectionLevel = colProtectionLevel;
    }

    public String getColProtectionLevel() {
        return colProtectionLevel;
    }

    public void setColProtectionLevel(String colProtectionLevel) {
        this.colProtectionLevel = colProtectionLevel;
    }

    public String getAcidAndWaterProtectionClasses() {
        return acidAndWaterProtectionClasses;
    }

    public void setAcidAndWaterProtectionClasses(String acidAndWaterProtectionClasses) {
        this.acidAndWaterProtectionClasses = acidAndWaterProtectionClasses;
    }


    @Override
    public String toString() {
        return super.toString() + ", colProtectionLevel='" + getColProtectionLevel() + '\'' +
                ", acidAndWaterProtectionClasses='" + getAcidAndWaterProtectionClasses();
    }

    public String getColour() {
        return null;
    }
}

