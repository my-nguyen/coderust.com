class MergeList {
   public static void main(String[] args) {
      System.out.println("ORIGINAL");
      String[] array1 = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
      MyLinkedList list1 = new MyLinkedList(array1);
      System.out.println(list1);
      String[] array2 = { "Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf" };
      MyLinkedList list2 = new MyLinkedList(array2);
      System.out.println(list2);

      System.out.println("SORTED");
      list1.sort();
      System.out.println(list1);
      list2.sort();
      System.out.println(list2);

      System.out.println("MERGED");
      MyLinkedList merged = list1.merge(list2);
      System.out.println(merged);
   }
}
