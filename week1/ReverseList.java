import java.util.*;

class Node {
   String data;
   Node next;

   Node(String data) {
      this.data = data;
      this.next = null;
   }

   public String toString() {
      return data;
   }
}

class List {
   Node head = null;

   void add(String data) {
      if (head == null)
         head = new Node(data);
      else {
         Node current = head;
         while (current.next != null) {
            current = current.next;
         }
         current.next = new Node(data);
      }
   }
}

class ReverseList {
   static List create(String[] array) {
      List list = new List();
      for (String element : array)
         list.add(element);
      return list;
   }

   static List reverse(List list) {
      List output = new List();
      Node current = list.head;
      while (current != null) {
         Node tmp = new Node(current.data);
         tmp.next = output.head;
         output.head = tmp;
         current = current.next;
      }
      return output;
   }

   static String toString(List list) {
      StringBuilder builder = new StringBuilder();
      Node current = list.head;
      while (current  != null) {
         builder.append(current.data).append(" ");
         current = current.next;
      }
      return builder.toString();
   }

   public static void main(String[] args) {
      String[] array = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
      List list = create(array);
      System.out.println(toString(list));
      List reversed = reverse(list);
      System.out.println(toString(reversed));
   }
}
