package by.itacademy.courses.hw10.Task4;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Pet implements Comparable<Pet> {
    private String nickname;
    private String breed;
    private int age;
    private double weight;
    private double price;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Comparator<Pet> getPetStoreComparator() {
        return PetStoreComparator;
    }

    public static void setPetStoreComparator(Comparator<Pet> petStoreComparator) {
        PetStoreComparator = petStoreComparator;
    }

    Pet(String nickname, String breed, int age, double weight, double price) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "nickname = " + nickname +
                ", breed = " + breed +
                ", age = " + age +
                ", weight = " + weight +
                ", price = " + price + " ";
    }

    public int compareTo(Pet o) {
        return nickname.compareTo(o.nickname);
    }

    public static Comparator<Pet> PetStoreComparator = new Comparator<>() {
        public int compare(Pet s1, Pet s2) {
            double rollno1 = s1.price;
            double rollno2 = s2.price;
            return (int) (rollno1 - rollno2);
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet petStore = (Pet) o;
        return Double.compare(petStore.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    public double getPrice() {
        return price;
    }

}
