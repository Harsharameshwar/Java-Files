class Runn implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Runn m1=new  Runn();  
Thread t1 =new Thread(m1,"Harsha"); 
t1.start();
System.out.println(t1.getName());
 }  
}  