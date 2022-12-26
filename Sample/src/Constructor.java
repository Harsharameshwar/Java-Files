
public class Constructor {
	int x,y,sum;
	Constructor(){
		System.out.print("Inside of default constructor\n");
	}
	Constructor(int a ,int b){
		x=a;y=b;
		sum=x+y;
	}
	void print() {
		System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor();
		obj.print();
	}

}
