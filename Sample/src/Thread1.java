class Thread1 implements Runnable{  
	
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Thread1 m1=new  Thread1(); 
Thread t1 =new Thread(m1);
Thread t2 = new Thread(m1);
t1.start();
t2.start();
try {
	System.out.println(t1.getState());
	t1.stop();
	t2.start();
	System.out.println(t1.getState());
}
catch(Exception e){
}
//System.out.println(t1.getState());
//System.out.println(t2.getState());
 }  
}  