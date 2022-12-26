import java.util.*;
class Shape {
	String color = "RED";
	int x=10,y=9;
	void draw()		{ System.out.println("Shape is drawn :");	}
	void rotate() 	{ System.out.println("Shape can be rotated.");	}
	void setColor() { System.out.println("Color is set to BLUE.");	}	
}

class Circle extends Shape {
	int r=5;
	void computeArea() { System.out.println("Area of Circle is : "+(3.142*r*r)+ "\n");	}	
}

class Line extends Shape {
	int l=10;
	void length() {	System.out.println("Length of Line is : "+l+ "\n");	}	
}

class Triang extends Shape {
	int angle=45;
	void computeArea() { 
		System.out.println("Area of tiangle is : "+(0.5*x*y)+"\n");	}	
}

public class Assignment2{
	public static void main(String[] args) {
		System.out.println("Parent Class Shape is created.\n ");
		Circle ob1=new Circle();
		ob1.draw();
		ob1.computeArea();
		Line ob2=new Line();
		ob2.draw();
		ob2.length();
		Triang ob3=new Triang();
		ob3.draw();
		ob3.computeArea();
}	}      
