class Animal{
	public Animal() {
//		System.out.print("nsb");
//		this.bark();
	}
	private void bark() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Barking");
	}
}
public class SingleInheritance {
	public static void main(String args[]) {
		Dog obj=new Dog();
		obj.bark();
	}
}
