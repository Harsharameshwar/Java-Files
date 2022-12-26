class Animal1{
	Animal1(){
		System.out.println("Animal Class Invoked");
	}
	void Method() {
		System.out.println("Animal");
	}
}
class Dog1 extends Animal1{
	Dog1(){
		System.out.println("Dog Class Invoked");
	}
	void Method() {
		System.out.println("Dog");
	}
}
class Cat extends Animal1{
	Cat(){
		System.out.println("Cat Class Invoked");
	}
	void Method() {
		System.out.println("Cat");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat obj=new Cat();
		Dog1 obj1=new Dog1();
		obj1.Method();
//		obj.Method();
		

	}

}
