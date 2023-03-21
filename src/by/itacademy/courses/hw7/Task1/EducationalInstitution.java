package by.itacademy.courses.hw7.Task1;

public class EducationalInstitution {
    Student student1 = new Student("Алексей", "Птушкин", 8, "Математики", 3);
    Student student2 = new Student("Александр", "Круг", 25, "Физики", 5);
    GraduateStudent graduateStudent1 = new GraduateStudent("Павел", "Сыч", 12, "Физики", 4, "Физика полёта ракеты");
    GraduateStudent graduateStudent2 = new GraduateStudent("Никита", "Елисов", 25, "Физики", 5, "Оптические иллюзии");
    Student[] students = new Student[]{graduateStudent1,graduateStudent2,student1, student2};

    void list() {
        for (Student studentX : students) {
            System.out.print(studentX.toString());
            System.out.println(" Cуммa стипендии: " + studentX.scholarship());
        }
    }
}
