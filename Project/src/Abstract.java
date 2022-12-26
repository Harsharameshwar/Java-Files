abstract class Bike{
	Bike(){System.out.println("Abstrct Class Constructor");}
	 abstract void run();
}
public class Abstract extends Bike {
	Abstract(){
		super();
	}
	void run() {
		System.out.println("Abstraction is going on");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj = new Abstract();
		obj.run();
	}

}
