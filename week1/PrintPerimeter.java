import java.util.*;

class PrintPerimeter {
   public static void main(String[] args) {
      MyTree tree = new MyTree();
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(10);
      tree.insert(25);
      tree.insert(35);
      tree.insert(50);
      tree.insert(5);
      tree.insert(15);
      tree.insert(28);
      tree.insert(41);

      List<Node> nodes = tree.iterativeInOrder();
      System.out.println(MyList.toString(nodes));

      List<Node> perimeters = tree.getPerimeters();
      System.out.println(MyList.toString(perimeters));
   }
}
