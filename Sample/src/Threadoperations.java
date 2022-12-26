import java.util.Scanner;

class Simple1 extends Thread{
public void run(){
 System.out.println("task one");
 int a,b,sum;
 Scanner obj = new Scanner(System.in);
 a=obj.nextInt();
 b=obj.nextInt();
 sum=a+b;
 System.out.println(sum);
 obj.close();
 }
}

class Simple2 extends Thread{
public void run(){
 System.out.println("task two");
 Scanner obj = new Scanner(System.in);
 int a,b,diff;
 a=obj.nextInt();
 b=obj.nextInt();
 diff=a-b;
 System.out.println(diff);
 obj.close();
 }
}

class Simple3 extends Thread{
public void run(){
 System.out.println("task three");
 Scanner obj = new Scanner(System.in);
 int a,b,mul;
 a=obj.nextInt();
 b=obj.nextInt();
 mul=a*b;
 System.out.println(mul);
 obj.close();
 }
}

class Threadoperations{
public static void main(String args[]){
 Simple1 t1=new Simple1();
 Simple2 t2=new Simple2();
 Simple3 t3=new Simple3();
 t1.start();
 t2.start();
 t3.start();
 }
}