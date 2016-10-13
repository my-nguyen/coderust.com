import java.text.*;
import java.util.*;

class test3 {
   public static void main(String[] args) {
      String input = "2016-09-08";
      SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
      try {
         Date date = format.parse(input);
         format = new SimpleDateFormat("MM/dd/yyyy");
         String output = format.format(date);
         System.out.println(output);
      } catch (ParseException e) {
         e.printStackTrace();
      }
   }
}
