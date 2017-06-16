package collectionPrograms;

import java.util.*;
public class HashMapDemo {

   public static void main(String args[]) {
   
      // Create a hash map
      HashMap hm = new HashMap();
      
      // Put elements to the map
      hm.put("Z", new Double(3434.34));
      hm.put("M", new Double(123.22));
      hm.put("A", new Double(1378.00));
      hm.put("D", new Double(99.22));
      hm.put("Q", new Double(-19.08));
      
      // Get a set of the entries
      Set set = hm.entrySet();
      
      // Get an iterator
      Iterator i = set.iterator();
      
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();           //typecasting to Map.entry element
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      
      // Deposit 1000 into Zara's account
      double balance = ((Double)hm.get("Z")).doubleValue();
      hm.put("Z", new Double(balance + 1000));
      System.out.println("Z's new balance: " + hm.get("Z"));
   }
}
