package by.itacademy.courses.hw5;

public class Phone {
    public String model;
    public double weight;
    public String number;

    public Phone(){}

    public  Phone(String number,String model){
        this.number=number;
        this.model=model;}

    public Phone(String number,String model,double weight){
        this.number=number;
        this.model=model;
        this.weight=weight;

    }
     String receiveCall(String name){
        return "Звонит " + name;
    }

     String getNumber(String number){
        return number;
    }

     String sendMessage(String number){
        return "Сообщение отправлено на следующие номер"+" "+number;
    }
     String receiveCall(String name,String number){
        return name+number;
    }
        }



