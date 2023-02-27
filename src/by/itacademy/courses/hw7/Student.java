package by.itacademy.courses.hw7;

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
        int scholarship=0;
        if (averageMark==5){
            scholarship=200;
        }else {
            scholarship=180;
        }
        return scholarship;
    }
}