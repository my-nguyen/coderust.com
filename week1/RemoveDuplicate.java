import java.util.*;

class RemoveDuplicate {
   // generate a random string of size length
   static String generate(int size) {
      char[] characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
      Random random = new Random();
      char[] array = new char[size];
      for (int i = 0; i < size; i++) {
         int index = random.nextInt(characterSet.length);
         array[i] = characterSet[index];
      }
      return new String(array);
   }

   // remove all duplicate characters from string
   static String remove(String input) {
      String result = new String(input);
      for (int i = 0; i < result.length(); i++) {
         String left = result.substring(0, i+1);
         String right = result.substring(i+1);
         String pattern = new String(new char[]{result.charAt(i)});
         String replaced = right.replace(pattern, "");
         result = left + replaced;
      }
      return result;
   }

   public static void main(String[] args) {
      if (args.length != 0) {
         int size = Integer.parseInt(args[0]);
         String string = generate(size);
         System.out.println(string);
         string = remove(string);
         System.out.println(string);
      }
   }
}
