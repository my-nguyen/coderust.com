class StackQueues {
   public static void main(String[] args) {
      MyStack stack = new MyStack();
      stack.push(5);
      stack.push(20);
      stack.push(17);
      stack.push(31);
      System.out.println("top: " + stack.top());

      stack.pop();
      System.out.println("top: " + stack.top());
   }
}
