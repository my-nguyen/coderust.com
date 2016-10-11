import java.util.*;

class MyList {
   static <T> String toString(List<T> list) {
      StringBuilder builder = new StringBuilder();
      for (T node : list)
         builder.append(node).append(" ");
      return builder.toString();
   }
}
