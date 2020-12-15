package com.automation.keyworddriven.scropts;
import java.security.AllPermission;
import java.util.*;
import java.util.ArrayList;

public class CollectionsDemo {
	public static void main(String[] args) {
		 //ArrayList<String> al = new ArrayList<>();
		List<String> al = new ArrayList<>(); 
		
		 al.add("Anil");
		 al.add("Sunil");
		 al.add("Ranjith");
		 al.add("Raju");
		 //al.clear();
		 
		 //Using For Loop
		 
//		 for (String string : al) {
//			 
//			 System.out.println(string);
//		}
//		 
		 
		 //Using For Loop
		 
//		 for (int i = 0; i < al.size(); i++) {
//			 
//			 System.out.println(al.get(i));
//			
//		}
		 
		 //Using list iterator method
		 
		 ListIterator<String> itr = al.listIterator();
		 System.out.println("In Forward Direction");
		 while (itr.hasNext()) {
		 System.out.println(itr.next());
			
		}
		 System.out.println("In Reverse Direction");
		 while (itr.hasPrevious()) {
		 System.out.println(itr.previous());
		 }
		 
		 //using Foreach loop with lamda direction
		 
		 al.forEach(a->{
			 System.out.println(a);
		 });
		 
		 //using Foreach Remaining Method
		 
		 Iterator<String> itr1 = al.iterator();
		 itr1.forEachRemaining(a->{
			 System.out.println(a);
			 
			 
		 });
		 
		 //System.out.println(al);
	}

}
