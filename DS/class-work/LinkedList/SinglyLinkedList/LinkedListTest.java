package datastructuremodule;

public class LinkedListTest {
	public static void main(String[] args) {
		
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","John",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",75,true);
		
		k1.next=k2;
		k2.next=k3; //k1.next.next=k3
		k3.next=k4;
		k4.next=k5;
		
		System.out.println("k1 : "+k1);
		System.out.println("k2 : "+k2);
		System.out.println("k3 : "+k3);
		System.out.println("k4 : "+k4);
		System.out.println("k5 : "+k5);
		System.out.println("--------------------");
		System.out.println("k1 :"+k1.hashCode());//100
		System.out.println("k2 :"+k2.hashCode()); //200
		System.out.println("k3 :"+k3.hashCode()); //300
		System.out.println("k4 :"+k4.hashCode());
		System.out.println("k5 :"+k5.hashCode());
		System.out.println("--------------------");
		
		System.out.println("k1.next :"+k1.next.hashCode());//200
		System.out.println("k2.next :"+k2.next.hashCode()); //300
		System.out.println("k3.next :"+k3.next.hashCode()); //400
		System.out.println("k4.next :"+k4.next.hashCode()); //500
		System.out.println("k5.next :"+k5.next); //null
		
		//self referential data structure
		
	}
}
class Kite
{
	String color;
	String owner;
	int length;
	boolean flying; //
	
	Kite next; //self referential data structure
	
	public Kite(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
	}

	@Override
	public String toString() {
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ", \n\t next="
				+ next + "]";
	}


	
	
}


