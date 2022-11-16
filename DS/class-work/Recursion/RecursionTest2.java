package datastructuremodule;

public class RecursionTest2 {
	public static void emptyVase(int flowerInVase) {
		if(flowerInVase>0) {
			//System.out.println(">"+flowerInVase);
			emptyVase(flowerInVase-1);
			System.out.println(">"+flowerInVase);
		}
		else {
			//nothing........
		}
	}
	public static void main(String[] args) {
		emptyVase(7);
	}
}


