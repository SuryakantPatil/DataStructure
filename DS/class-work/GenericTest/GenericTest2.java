package datastructuremodule;

import java.util.LinkedList;

public class GenericTest2 {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		
		MyValues<Integer> mi = new MyValues<Integer>(10,20);
		mi.print();
		mi.swap();
		mi.print();
		System.out.println("------------------------");
		MyValues<Float> mf = new MyValues<Float>(24.25f,54.25f);
		mf.print();
		mf.swap();
		mf.print();
		System.out.println("------------------------");
		
		Song s1 = new Song("kesariya","brhmastra","harshal",2022);
		Song s2 = new Song("birthday bash","album","yo yo baba",2010);
		
		MyValues<Song> jukeBox = new MyValues<Song>(s1,s2);
		jukeBox.print();
		jukeBox.swap();
		jukeBox.print();
		
	}
}
class MyValues<AnyType>{
	
	AnyType x;
	AnyType y;
	
	public MyValues(AnyType x, AnyType y) {
		
		this.x = x;
		this.y = y;
	}
	
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		
	}
	void swap() {
		System.out.println("swapping.....");
		AnyType temp=x; x=y; y=temp;
		System.out.println("swapped...");
		
	}
	
}
class Song{
	String title;
	String album;
	String artist;
	int year;
	public Song(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
	
	
}