package by.itacademy.courses.hw10.Task1;

import java.util.Set;
import java.util.TreeSet;

public class MergesAndIntersections {
   public static <T> Set<T>  union(Set<T> set1, Set<T> set2) {
      Set<T> result = new TreeSet<>(set1);
      result.addAll(set2);
      return result;
   }

   public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
      Set<T> result = new TreeSet<>(set1);
      result.retainAll(set2);
      return result;
   }
}
