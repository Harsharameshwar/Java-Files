	class Simple11 implements Runnable{
	public void run(){
	for(int i=0;i<5;i++) {
		System.out.println("COMPUTER SCIENCE");
	}
	 }
	}

	class Simple22 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("INFORMATION SCIENCE");
		}
	 }
	}
	public class threadmqp {
		public static void main(String args[]) {
			Simple11 obj= new Simple11();
			Simple22 obj1 = new Simple22();
			Thread t1= new Thread(obj);
			Thread t2 = new Thread(obj1);
			t1.start();
			t2.start();
		}
	}
