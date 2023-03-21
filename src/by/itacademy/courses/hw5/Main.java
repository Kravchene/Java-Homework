package by.itacademy.courses.hw5;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Arthas",25);
        System.out.println(person1.name()+"\n"+ person1.talk()+"\n"+person2.name()+"\n"+ person2.talk());
        System.out.println();

        Phone phone1= new Phone();
        Phone phone2= new Phone("+375293526432","samsung");
        Phone phone3= new Phone("+375333154060","honor",1.2);
        Phone phone = new Phone();
        System.out.println(phone1.receiveCall("Lina")+"\n"+phone2.receiveCall("Frank")+"\n"+phone3.receiveCall("Igor"));
        System.out.println(phone1.getNumber(phone1.number)+"\n"+phone2.getNumber(phone2.number)+"\n"+phone3.getNumber(phone3.number));
        phone.sendMessage("Сообщение отправлено на следующие номер","+375293526432","+375333154060");
        System.out.println(phone1.receiveCall("LIna", phone1.number)+
                "\n"+phone2.receiveCall("Frank", phone2.number)+"\n"+phone3.receiveCall("Igor", phone3.number));
    }
}
