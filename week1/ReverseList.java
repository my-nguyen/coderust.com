import java.util.*;

// a Node in a linked list
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

// a linked list implementation; the only instance variable is head, which points
// to the head of the linked list. to traverse the list (e.g. for adding a new
// node), you must start from the head and follow the next pointer in each node
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
   // create a linked list based on an array of String's
   static List create(String[] array) {
      List list = new List();
      for (String element : array)
         list.add(element);
      return list;
   }

   // reverse a linked list
   static List reverse(List list) {
      // create a new linked list, leaving the old one intact
      List result = new List();
      // traverse the old linked list
      Node current = list.head;
      while (current != null) {
         // create a new node based on the data in the current node of the old list
         Node tmp = new Node(current.data);
         // instead of traversing a whole linked list and adding the new node
         // at the end of the linked list, just adjust the head of the new list
         // to point to the new node
         tmp.next = result.head;
         result.head = tmp;
         // move on to the next node in the old list
         current = current.next;
      }
      // return the new linked list
      return result;
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
