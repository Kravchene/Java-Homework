package by.itacademy.courses.hw5;

public class Person {
        public String fullName;
        public int age;
        public Person() {
        }

        public Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

         String name() {
            return fullName + " двигается";
        }

         String talk() {
            return fullName + " говорит";
        }
}

