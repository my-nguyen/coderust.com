import java.util.*;

class MyStack {
   Deque<Integer> queue1 = new LinkedList<>();
   Deque<Integer> queue2 = new LinkedList<>();

   // ineffient push() but efficient pop()
   void push(int data) {
      // add new data to top of queue2, which is currently empty
      queue2.add(data);

      // move all contents of queue1 to queue2, while maintaining data at the
      // top of queue2
      while (!queue1.isEmpty())
         queue2.add(queue1.removeFirst());

      // swap queue1 and queue2, so that queue2 will be empty and queue1 contains
      // all nodes from queue2
      Deque<Integer> tmp = queue1;
      queue1 = queue2;
      queue2 = tmp;
   }

   void pop() {
      queue1.removeFirst();
   }

   int top() {
      return queue1.peek();
   }

   boolean isEmpty() {
      return queue1.isEmpty();
   }
}
