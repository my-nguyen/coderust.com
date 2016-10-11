import java.util.*;

class IterativeTraversal {
   public static void main(String[] args) {
      MyTree tree = new MyTree();
      tree.insert(1);
      tree.insert(2);
      tree.insert(3);
      tree.insert(4);
      tree.insert(5);

      List<Node> list = tree.iterativeInOrder();
      System.out.println(MyList.toString(list));
      list = tree.recursiveInOrder();
      System.out.println(MyList.toString(list));
   }
}
