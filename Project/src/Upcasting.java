class Parent{
	void run() {
		System.out.println("Parent Class");
	}
}
class Child extends Parent{
	void run() {
		System.out.println("Child Class");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj=new Child();
		obj.run();
	}

}
