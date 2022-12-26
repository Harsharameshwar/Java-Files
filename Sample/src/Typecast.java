
public class Typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1,i2;
		short s;
		byte b1=10,b2=20;
		i1=b2;
		s=b1;
		System.out.println("byte to short conversion");
		System.out.println(b1 + " " + s);
		System.out.println("byte to int conversion");
		System.out.println(s + " " + b1);
		char c = '2';
		i2=c;
		System.out.println("char to int conversion");
		System.out.println(c + " " + i2);
	}

}
