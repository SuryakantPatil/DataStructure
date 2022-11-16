import java.util.TreeSet;
import java.util.Iterator;

public class TreeTest {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		System.out.println("Container is created....");
		
		System.out.println("Adding 1st value..");
		ts.add(50);
		
		System.out.println("Adding 2nd value..");
		ts.add(25);
		
		System.out.println("Adding 3rd value..");
		ts.add(30);
		
		System.out.println("Adding 4th value..");
		ts.add(10);
		
		System.out.println("Adding 5th value..");
		ts.add(75);
		
		System.out.println("Adding 6th value..");
		ts.add(60);
		
		System.out.println("Adding 7th value..");
		ts.add(80);
		
		
		Iterator<Integer> integerIterator=ts.iterator();
		System.out.println("Retrived the iterator....");
		
		
		while(integerIterator.hasNext()) {
			Integer theValue = integerIterator.next();
			System.out.println("Integer value :"+theValue);
		}
	}
}
