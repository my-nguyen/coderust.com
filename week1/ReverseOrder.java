import java.util.*;

class ReverseOrder {
   static String[] reverse(String[] input) {
      String[] output = new String[input.length];
      for (int i = input.length-1, j = 0; i >= 0; i--, j++)
         output[j] = input[i];
      return output;
   }

   public static void main(String[] args) {
      String[] array = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
      System.out.println(MyArray.toString(array));
      System.out.println(MyArray.toString(reverse(array)));
   }
}
