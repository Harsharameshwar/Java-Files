class ThreadName extends Thread{   
	public void run(){     
		System.out.println("running...");    
	}   
	public static void main(String args[]){    
		ThreadName t1=new ThreadName();    
		ThreadName t2=new ThreadName();    
		System.out.println("Name of t1:"+t1.getName());    
		System.out.println("Name of t2:"+t2.getName());    
		System.out.println("id of t1:"+t1.getId());      
		t1.start();       
		t1.setName("Sonoo Jaiswal");    
		System.out.println("After changing name of t1:"+t1.getName()); 
		try {
			t1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(t1.isAlive());
		t2.start();   
		System.out.println(t2.isAlive());
		
	}  
}  