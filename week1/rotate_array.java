class rotate_array {
   static void intermediateArray(int[] array, int rotateBy) {
      int[] tmp = new int[rotateBy];
      for (int i = 0; i < rotateBy; i++)
         tmp[i] = array[i];
      for (int i = 0; i < array.length-rotateBy; i++)
         array[i] = array[i+rotateBy];
      for (int i = 0; i < rotateBy; i++)
         array[array.length-rotateBy+i] = tmp[i];
   }

   static void leftRotate(int[] array, int rotateBy) {
      for (int i = 0; i < rotateBy; i++) {
         // save the very first array element
         int tmp = array[0];
         // move every element, one by one, to the left by one unit
         for (int j = 0; j < array.length-1; j++)
            array[j] = array[j+1];
         // copy the saved array element to the last array element
         array[array.length-1] = tmp;
      }
   }

   static long gcd(long one, long two)
   {
      while (one != 0)
      {
         long tmp = one;
         one = two % one;
         two = tmp;
      }
      return two;
   }

   // i don't quite understand this algorithm
   static void juggle(int[] array, int rotateBy) {
      for (int i = 0; i < gcd(rotateBy, array.length); i++) {
         int j = i;
         int tmp = array[i];
         while (true) {
            int k = j + rotateBy;
            if (k >= array.length)
               k -= array.length;
            if (k == i)
               break;
            array[j] = array[k];
            j = k;
         }
         array[j] = tmp;
      }
   }

   static String toString(int[] array) {
      StringBuilder builder = new StringBuilder();
      for (int number : array)
         builder.append(number).append(" ");
      return builder.toString();
   }

   public static void main(String[] args) {
      if (args.length != 0) {
         int rotateBy = Integer.parseInt(args[0]);
         int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
         intermediateArray(array, rotateBy);
         System.out.println(toString(array));
         leftRotate(array, rotateBy);
         System.out.println(toString(array));
         juggle(array, rotateBy);
         System.out.println(toString(array));
      }
   }
}
