package Collections;

import java.util.ArrayList;
//import java.util.Iterator;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>(){{
            add("A");
            add("B");
            add("C");
              }};
		String[] arr=new String[list.size()];
		
		list.add("Ravi");
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		System.out.println(list);
		list.add("Aravind");
		System.out.println(list);
		list.addAll(1, list1);
		System.out.println(list.indexOf("A"));
//		list.remove("A");
		System.out.println(list);

		

	}

}