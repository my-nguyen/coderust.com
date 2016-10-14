class IntegerDivision {
   static int divide(int over, int under) {
      if (under == 0)
         throw new ArithmeticException("division by zero");

      int sign = 1;
      if (over < 0) {
         over = -over;
         sign = -sign;
      }
      if (under < 0) {
         under = -under;
         sign = -sign;
      }

      int result = 0;
      // count how many times you can subtract the divisor (under) from the
      // dividend (over) before 0 is reached
      while (over >= 0) {
         over -= under;
         result++;
      }

      return (result-1) * sign;
   }

   public static void main(String[] args) {
      if (args.length == 2) {
         int over = Integer.parseInt(args[0]);
         int under = Integer.parseInt(args[1]);
         System.out.println(divide(over, under));
      }
   }
}
