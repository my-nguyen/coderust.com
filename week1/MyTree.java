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

   public String toString() {
      return Integer.toString(data);
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

   static boolean isIdentical(Node one, Node two) {
      if (one == null && two == null)
         return true;
      if (one == null || two == null)
         return false;
      return one.data == two.data &&
         isIdentical(one.left, two.left) &&
         isIdentical(one.right, two.right);
   }

   void insert(int data) {
      Node node = new Node(data);
      if (root == null) {
         root = node;
      } else {
         Node current = root;
         Node parent = null;
         while (true) {
            parent = current;
            if (data < current.data) {
               current = current.left;
               if (current == null) {
                  parent.left = node;
                  break;
               }
            } else {
               current = current.right;
               if (current == null) {
                  parent.right = node;
                  break;
               }
            }
         }
      }
   }

   private void recurse(Node node) {
      if (node.left != null)
         recurse(node.left);
      tree.add(node);
      if (node.right != null)
         recurse(node.right);
   }
}
