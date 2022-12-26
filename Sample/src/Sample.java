import java.util.Scanner;
class Sample1{
	int x,y,sum;
	void print() {
		sum=x+y;
		System.out.println("Sum:"+sum);
	}
}
class Sample{
 public static void main(String args[]){
 System.out.println("sample:main");
 Sample s= new Sample();
 s.display();
 Sample1 obj=new Sample1();
 Scanner scan = new Scanner(System.in);
 obj.x=scan.nextInt();
 obj.y=scan.nextInt();
 obj.print();
 }
 void display(){
 System.out.println("display:main");
 }
}