public class Project1 {
	public void Addnumber(int a, int b) {
		int sum=0;
		sum=a+b;
		System.out.println(sum);
	}
	public void Addnumber(int a, int b,int c) {
		int sum=0;
		sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project1 obj= new Project1();
		obj.Addnumber(3,4);
		obj.Addnumber(3,4,5);
	}

}
