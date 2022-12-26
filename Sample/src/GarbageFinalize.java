class TestGarbage1{  
	public void finalize(){System.out.println("object is garbage collected");}  
		}  
public class GarbageFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TestGarbage1 s1=new TestGarbage1();  
		  TestGarbage1 s2=new TestGarbage1();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
	}

}
