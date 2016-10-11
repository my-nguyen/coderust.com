import java.util.*;

class IterativeTraversal {
   public static void main(String[] args) {
      MyTree tree = new MyTree();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
      List<Node> list = tree.iterativeInOrder();
      for (Node node : list)
         System.out.print(node.data + " ");
      System.out.println();

      list = tree.recursiveInOrder();
      for (Node node : list)
         System.out.print(node.data + " ");
      System.out.println();
   }
}
