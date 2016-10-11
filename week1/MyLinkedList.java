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
class MyLinkedList {
   Node head;
   int size;

   MyLinkedList() {
      head = null;
      size = 0;
   }

   MyLinkedList(String[] array) {
      for (String element : array)
         add(element);
   }

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
      size += 1;
   }

   void reverse() {
      // create a new head
      Node tete = null;
      // traverse the old linked list
      Node current = head;
      while (current != null) {
         // create a new node based on the data in the current node of the old list
         Node tmp = new Node(current.data);
         // instead of traversing a whole linked list and adding the new node
         // at the end of the linked list, just adjust the head of the new list
         // to point to the new node
         tmp.next = tete;
         tete = tmp;
         // move on to the next node in the old list
         current = current.next;
      }
      // reassign the old head to the new head
      head = tete;
   }

   void sort() {
      // copy the current linked list to an array
      String[] array = new String[size];
      int i = 0;
      Node current = head;
      while (current != null) {
         array[i] = current.data;
         i += 1;
         current = current.next;
      }

      // sort the array
      Arrays.sort(array);

      // transfer the array back to the linked list
      head = null;
      for (String element : array)
         add(element);
   }

   MyLinkedList merge(MyLinkedList list) {
      MyLinkedList result = new MyLinkedList();
      Node left = head;
      Node right = list.head;

      while (left != null && right != null) {
         if (left.data.compareTo(right.data) <= 0) {
            result.add(left.data);
            left = left.next;
         } else {
            result.add(right.data);
            right = right.next;
         }
      }

      while (left != null) {
         result.add(left.data);
         left = left.next;
      }
      while (right != null) {
         result.add(right.data);
         right = right.next;
      }

      return result;
   }

   public String toString() {
      StringBuilder builder = new StringBuilder();
      Node current = head;
      while (current  != null) {
         builder.append(current.data).append(" ");
         current = current.next;
      }
      return builder.toString();
   }
}
