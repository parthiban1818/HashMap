package hashmap;

import java.util.Map;
import java.util.Map.Entry;

public class Display {
 
	 public static void display() {
		 for(Map.Entry<Integer, Pojo> it :Insert.hp.entrySet()) {
			 System.out.println("Rollno -"+it.getKey());
			 System.out.println( "\nname-"+it.getValue().name+","+
			                   "\ngender-"+ it.getValue().gender+",\nemail-"+it.getValue().email+"\n");
		 }
	 }

		/*
		 * public static void displayByRollNO(int rollNo) { for(Map.Entry<Integer, Pojo>
		 * it: Insert.hp.entrySet()) { if(Insert.hp.get(it).equals(rollNo)) {
		 * System.out.println("Rollno-"+rollNo); System.out.println(
		 * "\nname-"+it.getValue().name+","+ "\ngender-"+
		 * it.getValue().gender+",\nemail-"+it.getValue().email+"\n"); } } }
		 */
	 public static void noOfStudents() {
		 System.out.println("Total no students is "+Insert.hp.size());
	 }
	 public static void containKey(int rollNo) {
		 System.out.println(Insert.hp.containsKey(rollNo));
	 }
	 
	 public static void searchByMobileNo(long num) {
		 for(Entry<Integer, Pojo> p:Insert.hp.entrySet()) {
			 if(num==p.getValue().mobile | num ==(long) p.getKey()) {
				 System.out.println(p.getKey());
				 System.out.println(p.getValue().name+"\n"+p.getValue().gender+"\n"+p.getValue().mobile+"\n"+p.getValue().email+"\n");
			 }
		 }
	 }
	 public static void searchByName(String name) {
		 for(Entry<Integer, Pojo> p:Insert.hp.entrySet()) {
			 if(name.equals(p.getValue().name) || name.equals(p.getValue().email)) {
				 System.out.println(p.getKey());
				 System.out.println(p.getValue().name+"\n"+p.getValue().gender+"\n"+p.getValue().mobile+"\n"+p.getValue().email+"\n");
			 }
		 }
	 }
}
