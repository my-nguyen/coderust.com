import java.util.*;

class binary_search {
   static Random random = new Random();
   static final int MAX = 1000;

   // generate an unsorted list of integers of size
   static List<Integer> generate(int size) {
      Set<Integer> set = new HashSet<>();
      while (set.size() != size) {
         set.add(random.nextInt(MAX));
      }
      return new ArrayList<Integer>(set);
   }

   // perform binary search
   static int search(List<Integer> list, int target) {
      int lower = 0;
      int upper = list.size();
      while (true) {
         if (upper < lower)
            return -1;

         int middle = lower + (upper-lower)/2;
         if (list.get(middle) < target) {
            lower = middle + 1;
         } else if (list.get(middle) > target) {
            upper = middle - 1;
         } else {
            return middle;
         }
      }
   }

   static String toString(List<Integer> list) {
      StringBuilder builder = new StringBuilder();
      for (int number : list) {
         builder.append(number).append(" ");
      }
      return builder.toString();
   }

   public static void main(String[] args) {
      if (args.length != 0) {
         int size = Integer.parseInt(args[0]);
         List<Integer> list = generate(size);
         Collections.sort(list);
         System.out.println("list: " + list);
         int index = random.nextInt(size);
         int target = list.get(index);
         System.out.println("index: " + index + ", target: " + target);
         System.out.println(search(list, target));
      }
   }
}
