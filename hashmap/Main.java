package hashmap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 System.out.println("   !!! WELCOME TO ABC SCHOOL !!!");
		 while(true) {
		 System.out.println("<Press 1> for adding student details");
		 System.out.println("<Press 2> for display all the student details");
		 System.out.println("<Press 3> for the rollNo is exists or not ");
		 System.out.println("<press 4> for the student detail is exists or not");
		 System.out.println("<press 5> for total no of students");
		 System.out.println("<press 6> for to remove all student details");
		 System.out.println("<press 7> for check the database is empty or not");
		 System.out.println("<press 8> for shallow copy");
		 System.out.println("<Press 9> copy one hashmap to another hashmap");
		 System.out.println("<press 10> search by mobile no or rollno");
		 System.out.println("<press 11> search by student name or mail id");
		 System.out.println("<press 12> for logout");
         Scanner sc =new Scanner(System.in);
         int option =sc.nextInt();
         switch(option) {
           case 1:Insert.insert();break;
           case 2:Display.display();break;
           case 3:{
        	   System.out.println("enter rollNo");
        	   int rollNo=sc.nextInt();
        	   Display.containKey(rollNo);
        	   break;
             }
           case 4: {
        	   System.out.println("<press 1>search by name or mail or gender");
        	   System.out.println("<press 2>search by rollNo or mobile"); 
        	   int n=sc.nextInt();
        	   switch(n) {
        	   case 1:
        	   }
           }
           case 5:Display.noOfStudents();break;
           case 6:RemoveAndCopy.removeAll();break;
           case 7:RemoveAndCopy.emptyOrNot();break;
           case 8:RemoveAndCopy.copy();break;
           case 9:RemoveAndCopy.oneToAnother();break;
           case 10:{
        	   System.out.println("enter mobile no or roll no");
        	   long n=sc.nextLong();
        	   Display.searchByMobileNo(n);
        	   break;
           }
           case 11:{
        	   System.out.println("enter student name");
        	   String name=sc.next();
        	   Display.searchByName(name);
        	   break;
           }
           case 12:{
        	   System.out.println("you are successfully logout");
        	   System.exit(0);
           }
           default : 
        	   System.err.println("you entered wrong input");
         } 
		}
	}

}
