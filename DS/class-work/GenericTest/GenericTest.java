package datastructuremodule;

public class GenericTest {
	public static void swap(Integer x, Integer y) {
		
		System.out.println("swapping..."+x.hashCode()+","+y.hashCode());
		Integer temp=x;
		x=y;
		y=temp;
		System.out.println("swapped...");
	}
	
	public static void main(String[] args) {

		Integer x=10;
		Integer y=20;
		System.out.println("main...."+x.hashCode()+","+y.hashCode());
		System.out.println("x "+x);
		System.out.println("y "+y);
		
		swap(x,y);
		
		System.out.println("x "+x);
		System.out.println("y "+y);
}}
