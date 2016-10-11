class SquareRoot {
   static double sqrt(double number) {
      if (number >= 0) {
         double result = number/2;
         for (int i = 0; i < 10; i++)
            result = (result + number/result) / 2;
         return result;
      } else {
         return -1;
      }
   }

   public static void main(String[] args) {
      System.out.println("squrt(1): " + sqrt(1));
      System.out.println("squrt(4): " + sqrt(4));
      System.out.println("squrt(9): " + sqrt(9));
      System.out.println("squrt(2): " + sqrt(2));
   }
}
