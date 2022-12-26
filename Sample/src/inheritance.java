class A{
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
}
class C extends A{
	C(){
		System.out.println("C");
	}
	void print() {
		System.out.print("Hello");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
//		c.print();
	}

}
