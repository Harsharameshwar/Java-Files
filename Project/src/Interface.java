interface inter{
	void run();
}
interface inter1{
	void run1();
}
class A {
	void run2() {
		System.out.println("Class Parent");
	}
}
public class Interface extends A implements inter,inter1 {
	public void run() {
		System.out.println("Inter Abstract");
	}
	public void run1() {
		System.out.println("Inter1 Abstract");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.run();
		obj.run1();
		obj.run2();
	}

}
