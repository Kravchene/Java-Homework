package by.itacademy.courses.hw10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> result1 = new TreeSet<>();
        result1.add(1);
        result1.add(15616);
        result1.add(213);
        Set<Integer> result2 = new TreeSet<>();
        result2.add(1123);
        result2.add(16);
        result2.add(213);
        System.out.println(MergesAndIntersections.union(result1, result2));
        System.out.println(MergesAndIntersections.intersect(result1, result2));
        System.out.println("конец task1");
        //конец task1

        System.out.println("Введите любой текст");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String regex = "\\s|\\.|,|!|\\?";
        Map<String, Integer> map = new HashMap<>();
        for (String word : text.split(regex)) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("конец task2");
        //конец task2

        Deque<Double> deque = new ArrayDeque<>();
        deque.push(2412.4);
        deque.push(34.5);
        deque.push(1.24);
        System.out.println(max(deque));
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
        System.out.println("конец task3");
        //конец task2

        List<PetStore> sortedSet = new LinkedList<>();
        System.out.println("Добро пожаловать в магазин");
        sortedSet.add(new Parrot("Gosha", "Cockatoo", 3, 1.5, 154));
        sortedSet.add(new Parrot("Kesha", "Cockatoo", 5, 2, 41));
        sortedSet.add(new Cat("blackie", "Maine Coon", 15, 12, 516));
        sortedSet.add(new Cat("snowball", "Maine Coon", 10, 11.2, 205));
        sortedSet.add(new Dog("Frederick", "Border Collie", 10, 17, 300));
        sortedSet.add(new Dog("Lancelot", "Border Collie", 10, 20.1, 600));
        System.out.println(sortedSet);
        Collections.sort(sortedSet);
        System.out.println(sortedSet);
        Collections.sort(sortedSet, PetStore.PetStoreComparator);
        System.out.println(sortedSet);
        Scanner in1 = new Scanner(System.in);
        System.out.println("*** Это раздел поиска ***");
        System.out.println("Укажите сумму которую вы готовы заплатить за питомцы и мы вам подберем самые близкие к этому значнию");
        int Money = in1.nextInt();
        PetStore.search(Money, sortedSet);
        //конец task4
    }

    public static Double max(Deque<Double> deque) {
        Double number = 0.0;
        for (Double a : deque) {
            if (number < a) {
                number = a;
            }
        }
        return number;
    }
}
