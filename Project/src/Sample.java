public class Sample {
	private int a,b,c;
	public Sample() {
		System.out.println("Object Created");
	}
	
	public Sample(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public Sample(int a,int b,int c) {
		this(a,b);
		this.c=c;
	}
	public void Addnumber() {
		int sum=0;
		sum=a+b+c;
		System.out.println(sum);
	}
	{System.out.println("Welcome");}
	public static void main(String[] args) {
		
		Sample obj= new Sample();
		Sample obj1= new Sample(3,4);
		Sample obj2= new Sample(3,4,5);
		obj1.Addnumber();
		obj2.Addnumber();
}
}
