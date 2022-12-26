
public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,i,c;
		int n = Integer.parseInt(args[0]);
		for(i=1;i<=n;i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			
		}
	}

}
