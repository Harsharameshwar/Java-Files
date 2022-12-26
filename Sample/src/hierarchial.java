class AC{
	public void methodA(){
		System.out.println("A");
	}
}
class BC extends AC{
	public void methodB(){
		System.out.println("B");
	}
}
//class CC extends AC{
//	
//}

public class hierarchial extends AC {
	public void methodc() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		AC obj =  new AC();
////		BC obj1 = new BC();
//		CC obj2 = new CC();
////		obj.methodA();
////		obj1.methodA();
//		obj2.methodA();
//		obj2.methodc();
		hierarchial obj = new hierarchial();
		obj.methodA();


	}

}
