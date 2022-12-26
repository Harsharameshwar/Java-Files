class Account {
	public void method1() {
		System.out.println("Class Account accessed from child class");  }   }
class Saving extends Account {
	public void method2() {
		System.out.println("Class Saving inherits Account");  }   }
class FD extends Account {
	public void method3() {
		System.out.println("Class FD inherits Account");  }   }
class Current extends Account {
	public void method4() {
		System.out.println("Class Cuurent inherits Account");  }   }
class Short extends FD {
	public void method5() {
		System.out.println("Class Short inherits FD");  }   }
class Medium extends FD {
	public void method6() {
		System.out.println("Class Medium inherits FD");  }   }
class Long extends FD {
	public void method7() {
		System.out.println("Class Long inherits FD");  }   }
public class Assignment1 {
	public static void main(String[] args) {
        Account ob1=new Account();
        Saving ob2=new Saving();
        Medium ob3=new Medium();
        ob2.method1();
        ob2.method2();
        ob3.method6();
        ob3.method3();
        ob3.method1();    
}   } 
