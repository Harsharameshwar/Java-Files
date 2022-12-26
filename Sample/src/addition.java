import java.util.Scanner;
public class addition {
	int x,y,sum;
	int p,q;
	public void input() {
	Scanner scan=new Scanner(System.in);
	p=scan.nextInt();
	q=scan.nextInt();
	calculate(p,q);
	}
	public void calculate(int a ,int b) {
		x=a;
		y=b;
		sum=x+y;
		
	}
	public void display() {
		System.out.print(sum);
	}
	public static void main(String[] args) {
		addition obj = new addition();
		obj.input();
		obj.display();
	}
}
