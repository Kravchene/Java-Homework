package by.itacademy.courses.hw7.Task1;

public class GraduateStudent extends Student {

    public String scientificWork;

    GraduateStudent(String name, String surname, int courseNumber, String groupName, int averageMark, String scientificWork) {
        super(name, surname, courseNumber, groupName, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public String toString() {
        return "scientificWork='" + scientificWork + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courseNumber=" + courseNumber +
                ", groupName='" + groupName + '\'' +
                ", averageMark=" + averageMark;
    }

    @Override
    public int scholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
