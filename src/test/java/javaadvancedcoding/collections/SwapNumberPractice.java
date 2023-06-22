package javaadvancedcoding.collections;

public class SwapNumberPractice {
public static void main(String[] args) {
	
	int x= 100;
	int y = 200;
		
	y=x+y; //100+200=300
	x=y-x; //300-100=200
	y=y-x; //300-200=100
	
	System.out.println("x value is: " + x);
	
	System.out.println("x value is: " + y);

}
}
