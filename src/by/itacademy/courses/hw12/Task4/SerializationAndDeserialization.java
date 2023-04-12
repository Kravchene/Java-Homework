package by.itacademy.courses.hw12.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SerializationAndDeserialization {
    Person person1 = new Person("Мария", "Смирнова", 20);
    Person person2 = new Person("Эмилия", "Евдокимова", 20);
    Person person3 = new Person("Есения", "Орлова", 20);
    Person person4 = new Person("Лев", "Лебедев", 20);
    Person person5 = new Person("Илья", "Латышев", 20);
    List<Person> list = new ArrayList<>();

    void personAdd() {
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
    }

    void serialization() {
        try (FileOutputStream outputStream = new FileOutputStream("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task4\\Person.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(list);
            System.out.println("неотсортировано");
            for (Object a : list) {
                System.out.println(a.toString());
            }
            System.out.println();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    void deserialization() {
        List<Person> listFromFile;
        try (FileInputStream inputStream = new FileInputStream("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task4\\Person.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            listFromFile = (List<Person>) objectInputStream.readObject();
            listFromFile.sort(new Comparator<Person>() {
                public int compare(Person o1, Person o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
            System.out.println("отсортировано");
            for (Object a : listFromFile) {
                System.out.println(a.toString());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        }
    }
}
