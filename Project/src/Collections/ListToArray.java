package Collections;

import java.util.ArrayList;
//import java.util.Iterator;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		String[] arr=new String[list.size()];
		
		list.add("Ravi");
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		System.out.println(list);
		arr= list.toArray(new String[0]);
		for (String x : arr)
            System.out.print(x + " ");
		
	}

}