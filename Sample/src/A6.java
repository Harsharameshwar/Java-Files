interface printable{  
void print();  
}   
class A5{
	public void msg() {
		System.out.println("Parentclass");
	}
}
class A6 extends A5 implements printable {

	public void print(){System.out.println("Hello");} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 obj = new A6();  
		obj.print(); 
		obj.msg();
	}

}
