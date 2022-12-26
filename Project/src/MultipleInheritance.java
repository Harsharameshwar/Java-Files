class Parent1 {
	void run() {
		System.out.println("Parent Class");
	}
}
interface Parnt{
	void run();
}
public class MultipleInheritance extends Parent1 implements Parnt  {
	public void run() {
		System.out.println("Multiple Inheritance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj=new MultipleInheritance();
		obj.run();
//		obj.run1();
	}

}
