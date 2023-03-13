package by.itacademy.courses.hw10;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class PetStore implements Comparable<PetStore> {
    String nickname;
    String breed;
    int age;
    double weight;
    double price;


    PetStore(String nickname, String breed, int age, double weight, double price) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                "price=" + price + " ";
    }

    public int compareTo(PetStore o) {
        return nickname.compareTo(o.nickname);
    }

    public static Comparator<PetStore> PetStoreComparator = new Comparator<>() {
        public int compare(PetStore s1, PetStore s2) {
            double rollno1 = s1.price;
            double rollno2 = s2.price;
            return (int) (rollno1 - rollno2);

        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetStore petStore = (PetStore) o;
        return Double.compare(petStore.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    public double getPrice() {
        return price;
    }
    public static void search(int Money, List<PetStore> sortedSet) {
        if (Money < 149) {
            for (PetStore asd : sortedSet) {
                if (asd.getPrice() < 149) {
                    System.out.println(asd);
                }
            }
        } else if (Money >= 150 && Money < 299) {
            for (PetStore asd : sortedSet) {
                if (asd.getPrice() >= 150 && asd.getPrice() < 299) {
                    System.out.println(asd);
                }
            }
        } else if (Money >= 300 && Money < 449) {
            for (PetStore asd : sortedSet) {
                if (asd.getPrice() >= 300 && asd.getPrice() < 449) {
                    System.out.println(asd);
                }
            }
        } else if (Money >= 450) {
            for (PetStore asd : sortedSet) {
                if (asd.getPrice() >= 450) {
                    System.out.println(asd);
                }
            }
        }
        System.out.println("Это все питомцы которые у нас есть по вашему запросу");
    }
}
