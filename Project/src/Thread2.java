
public class Thread2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 obj=new Thread2();
		Thread t=new Thread(obj,"Harsha's Thread");
		t.start();
		System.out.println(t.getState());
		System.out.println(t.isAlive());
//		t.join(1000);
//		System.out.println(t.getName());
//		System.out.println(t.getName());
//		System.out.println(t.getName());
		System.out.println(t.getPriority());



	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		try {
			Thread.sleep(2000);
			
		}
		catch(Exception err) {
			System.out.println(err);
		}
	}

}