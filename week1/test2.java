class test2 {
   public static void main(String[] args) {
      String input = "[28,12,37]";
      String[] tokens = input.split("[\\[\\],]");
      for (String token : tokens)
         System.out.println("token: '" + token + "'");
   }
}
