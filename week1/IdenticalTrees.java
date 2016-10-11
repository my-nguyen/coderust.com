import java.util.*;

class IdenticalTrees {
   public static void main(String[] args) {
      MyTree tree1 = new MyTree();
      tree1.insert(1);
      tree1.insert(2);
      tree1.insert(3);
      tree1.insert(4);
      tree1.insert(5);
      List<Node> list = tree1.iterativeInOrder();
      System.out.println(MyList.toString(list));

      MyTree tree2 = new MyTree();
      tree2.insert(1);
      tree2.insert(2);
      tree2.insert(3);
      tree2.insert(4);
      tree2.insert(5);
      list = tree2.iterativeInOrder();
      System.out.println(MyList.toString(list));

      MyTree tree3 = new MyTree();
      tree3.insert(1);
      tree3.insert(2);
      tree3.insert(3);
      tree3.insert(4);
      tree3.insert(6);
      list = tree3.iterativeInOrder();
      System.out.println(MyList.toString(list));

      System.out.println("tree1 equals tree2: " + MyTree.isIdentical(tree1.root, tree2.root));
      System.out.println("tree1 equals tree3: " + MyTree.isIdentical(tree1.root, tree3.root));
   }
}
