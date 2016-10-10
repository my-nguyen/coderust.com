import java.util.*;

class Array {
   static final int MAX = 100;

   // generate an unsorted list of integers of size
   static int[] generate(int size) {
      Set<Integer> set = new HashSet<>();
      Random random = new Random();
      while (set.size() != size) {
         set.add(random.nextInt(MAX));
      }

      int[] array = new int[size];
      int index = 0;
      for (int element : set) {
         array[index] = element;
         index++;
      }
      return array;
   }

   static String toString(int[] list) {
      StringBuilder builder = new StringBuilder();
      for (int number : list) {
         builder.append(number).append(" ");
      }
      return builder.toString();
   }
}
