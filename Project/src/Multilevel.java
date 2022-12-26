class Animal2{
	Animal2(){
		System.out.println("Animal Class Invoked");
	}
	void Method() {
		System.out.println("Animal");
	}
}
class Cat1 extends Animal2{
	Cat1(){
		System.out.println("Cat Class Invoked");
	}
	void Method() {
		System.out.println("Cat");
	}
}
public class Multilevel {
	Cat1 obj=new Cat1();
//	obj.Method();

}
