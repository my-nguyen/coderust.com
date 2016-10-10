import java.util.*;

class SmallestCommon {
   static int smallest(int[] array1, int[] array2, int[] array3) {
      for (int i = 0; i < array1.length; i++) {
         for (int j = 0; j < array2.length; j++) {
            if (array2[j] > array1[i])
               break;
            if (array2[j] == array1[i]) {
               for (int k = 0; k < array3.length; k++) {
                  if (array3[k] > array1[i])
                     break;
                  if (array3[k] == array1[i])
                     return array1[i];
               }
            }
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      if (args.length != 0) {
         int size = Integer.parseInt(args[0]);
         int[] array1 = MyArray.generate(size);
         System.out.println(MyArray.toString(array1));
         int[] array2 = MyArray.generate(size);
         System.out.println(MyArray.toString(array2));
         int[] array3 = MyArray.generate(size);
         System.out.println(MyArray.toString(array3));
         Arrays.sort(array1);
         System.out.println(MyArray.toString(array1));
         Arrays.sort(array2);
         System.out.println(MyArray.toString(array2));
         Arrays.sort(array3);
         System.out.println(MyArray.toString(array3));
         System.out.println(smallest(array1, array2, array3));
      }
   }
}
