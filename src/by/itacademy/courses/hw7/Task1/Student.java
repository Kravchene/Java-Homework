package by.itacademy.courses.hw7.Task1;

public class Student implements Scholarship {
    public String name;
    public String surname;
    public int courseNumber;
    public String groupName;
    public int averageMark;

    Student(String name, String surname, int courseNumber,String groupName,int averageMark){
        this.name=name;
        this.surname=surname;
        this.courseNumber=courseNumber;
        this.groupName=groupName;
        this.averageMark=averageMark;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courseNumber=" + courseNumber +
                ", groupName='" + groupName + '\'' +
                ", averageMark=" + averageMark ;
    }

    @Override
    public int scholarship() {
        if (averageMark==5){
            return 100;
        }else {
            return 80;
        }
    }
}