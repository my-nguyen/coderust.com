import java.util.*;

class Node {
   int data;
   Node left;
   Node right;

   Node(int number) {
      data = number;
      left = null;
      right = null;
   }
}

class MyTree {
   Node root;

   List<Node> iterativeInOrder() {
      if (root == null)
         return null;

      List<Node> list = new ArrayList<>();
      Deque<Node> stack = new ArrayDeque<>();
      Node node = root;

      while (!stack.isEmpty() || node != null) {
         if (node != null) {
            // traverse the left branch while saving the node along the way
            stack.push(node);
            node = node.left;
         } else {
            // process the saved node then proceed to the right branch
            node = stack.pop();
            list.add(node);
            node = node.right;
         }
      }

      return list;
   }

   List<Node> tree = new ArrayList<>();
   List<Node> recursiveInOrder() {
      if (root != null)
         recurse(root);
      return tree;
   }

   void recurse(Node node) {
      if (node.left != null)
         recurse(node.left);
      tree.add(node);
      if (node.right != null)
         recurse(node.right);
   }
}
