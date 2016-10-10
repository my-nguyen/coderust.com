import java.util.*;

class heap_sort {
   // this builds a subtree rooted at index
   static void heapify(int[] array, int size, int index) {
      int left = index * 2;
      int right = index*2 + 1;
      // largest as root
      int largest = index;

      // if left child is larger than root
      if (left < size && array[left] > array[largest])
         largest = left;
      // if right child is larger than largest so far
      if (right < size && array[right] > array[largest])
         largest = right;

      // if largest is not root
      if (largest != index) {
         int tmp = array[index];
         array[index] = array[largest];
         array[largest] = tmp;

         // recursively heapify the affected subtree
         heapify(array, size, largest);
      }
   }

   static void buildHeap(int[] array) {
      for (int i = array.length/2-1; i >= 0; i--)
         heapify(array, array.length, i);
   }

   static void sort(int[] array) {
      buildHeap(array);

      // one by one extract an element from the heap
      for (int i = array.length-1; i >= 0; i--) {
         // move current root to end
         int tmp = array[0];
         array[0] = array[i];
         array[i] = tmp;

         // heapify on the reduced heap
         heapify(array, i, 0);
      }
   }

   static String toString(int[] array) {
      StringBuilder builder = new StringBuilder();
      for (int number : array) {
         builder.append(number).append(" ");
      }
      return builder.toString();
   }

   static int[] generate(int size) {
      final int MAX = 100;
      Random random = new Random();
      Set<Integer> set = new HashSet<>();

      while (set.size() != size) {
         set.add(random.nextInt(MAX));
      }
      // return set.toArray(new Integer[size]);
      int[] array = new int[size];
      int index = 0;
      for (int element : set) {
         array[index] = element;
         index++;
      }
      return array;
   }

   public static void main(String[] args) {
      if (args.length != 0) {
         int size = Integer.parseInt(args[0]);
         int[] array = generate(size);
         System.out.println(toString(array));
         sort(array);
         System.out.println(toString(array));
      }
   }
}
