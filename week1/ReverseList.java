import java.util.*;

class ReverseList {
   public static void main(String[] args) {
      String[] array = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
      MyLinkedList list = new MyLinkedList(array);
      System.out.println(list);
      list.reverse();
      System.out.println(list);
   }
}
