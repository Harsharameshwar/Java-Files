import java.util.Scanner;
public class sampleprogram {
	public int x,y,sum;
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the values of x and y:");
		x= scanner.nextInt();
		y=scanner.nextInt();
	}
	public void calculate() {
		sum = x+y;
	}
	public void display() {
		System.out.println("Sum of x and y is :"+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleprogram sam= new sampleprogram();
		sam.input();
		sam.calculate();
		sam.display();
	}

}
