package Collections;

import java.util.*;  
class Arrays{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
} 