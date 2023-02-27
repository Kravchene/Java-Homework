package by.itacademy.courses.hw7;

public class GraduateStudent extends Student implements Scholarship{

    public String scientificWork;

    GraduateStudent(String name, String surname, int courseNumber, String groupName, int averageMark,String scientificWork) {
        super(name, surname, courseNumber, groupName, averageMark);
        this.scientificWork=scientificWork;
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
        int scholarship=0;
        if (averageMark==5){
            scholarship=100;
        }else {
            scholarship=80;
        }
        return scholarship;
    }
}
