package hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveAndCopy {
	//code for remove all student details
       public static void removeAll() {
    	   Insert.hp.clear();
    	   System.out.println("All student details are removed");
       }
    //code for check the database is empty or not...
       public static void emptyOrNot() {
    	   boolean b=Insert.hp.isEmpty();
    	   if(b==true)
    		   System.err.println("The database is empty\n");
    	   else 
    		   System.out.println("it contains information\n");
       }
       public static void copy() {
    	  Object obj=Insert.hp.clone();
    	  if(obj.equals(Insert.hp))
    		  System.out.println("copied...\n");
    	  }
       public static void oneToAnother() {
    	    HashMap<Integer,Pojo> copied =new HashMap();
    	    for(Map.Entry<Integer, Pojo> it: Insert.hp.entrySet()) {
    	    	copied.put(it.getKey(),it.getValue());
    	    }
    	    System.out.println("original map");
    	    Display.display();
    	    for(Map.Entry<Integer, Pojo> it: copied.entrySet()) {
    	    	System.out.println("copied map:");
    	    	 System.out.println(it.getKey());
    	    	 System.out.println(it.getValue().name+"\n"+it.getValue().gender+"\n"+it.getValue().email+"\n"+it.getValue().mobile);
    	    }
       }
}
