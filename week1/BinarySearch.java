import java.util.*;

class BinarySearch {

   // perform binary search
   static int search(int[] list, int target) {
      int lower = 0;
      int upper = list.length;
      while (true) {
         if (upper < lower)
            return -1;

         int middle = lower + (upper-lower)/2;
         if (list[middle] < target) {
            lower = middle + 1;
         } else if (list[middle] > target) {
            upper = middle - 1;
         } else {
            return middle;
         }
      }
   }

   public static void main(String[] args) {
      if (args.length != 0) {
         int size = Integer.parseInt(args[0]);
         int[] list = Array.generate(size);
         System.out.println(Array.toString(list));
         Arrays.sort(list);
         System.out.println(Array.toString(list));
         int index = new Random().nextInt(size);
         int target = list[index];
         System.out.println("target: " + target);
         System.out.println(search(list, target));
      }
   }
}
