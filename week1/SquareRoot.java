class SquareRoot {
   static double sqrt(double x) {
      if (x >= 0) {
         // let guess be a guess of what the square root might be
         double guess = x/2;
         // repeat the following operation a few times
         for (int i = 0; i < 10; i++)
            // take the average of guess and x/guess
            // this will bring guess closer to the square root of x
            guess = (guess + x/guess) / 2;
         // guess now is pretty close to the square root of x
         return guess;
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
