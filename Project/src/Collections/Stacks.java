package Collections;

import java.util.Stack;
import java.util.Vector;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <Integer> stack=new Stack<>() {{
			push(1);
			push(2);
			push(3);
			push(4);
		}};
		System.out.println(stack);
		System.out.println(stack.contains(5));
		stack.push(5);
		stack.pop();
		System.out.println(stack);
		

}
}