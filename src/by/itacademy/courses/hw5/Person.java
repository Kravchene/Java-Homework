package by.itacademy.courses.hw5;

public class Person {
        public static String fullName;
        public int age;
        public Person(){}
        public Person(String fullName,int age){
            this.fullName=fullName;
            this.age=age;
        }
        static String name(){
            return fullName+" двигается";
        }
        static String talk(){
            return fullName+ " говорит";
        }
    }

