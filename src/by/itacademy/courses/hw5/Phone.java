package by.itacademy.courses.hw5;

public class Phone {
    String model;
    double weight;
    String number;

    public Phone() {
    }

    public  Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }
     String receiveCall(String name) {
        return "Звонит " + name;
    }

     String getNumber(String number) {
        return number;
    }

     void sendMessage(String message, String... numbers) {
        for (String number : numbers) {
            System.out.println(message + number);
        }
    }

     String receiveCall(String name, String number) {
        return name + number;
    }
}



