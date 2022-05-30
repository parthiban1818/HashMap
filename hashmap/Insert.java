package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Insert {
	   
       static HashMap <Integer,Pojo>hp =new HashMap();
       public static void insert() {
    	   Scanner sc=new Scanner(System.in); 
    	   System.out.println("enter roll no");
    	   int rollno=sc.nextInt();
    	   if(hp.containsKey(rollno)) {
    		   System.err.println("roll no already exists try again"); 
    		    Main.main(null);
    	   }
    	   else {
    	   Pojo studentDetail =new Pojo(); 
    	   System.out.println("enter name");
    	   studentDetail.setName(sc.next());
    	   System.out.println("enter gender");
    	   studentDetail.setGender(sc.next());
    	   System.out.println("enter mobile");
    	   studentDetail.setMobile(sc.nextLong());
    	   System.out.println("enter mail id");
    	   studentDetail.setEmail(sc.next());
    	   hp.put(rollno, studentDetail);
    	  }
       }
}
