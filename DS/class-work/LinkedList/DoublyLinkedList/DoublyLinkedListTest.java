package datastructuremodule;

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		MySong ms1 = new MySong("kesariya","brhamastra","arijeet singh",2022);
		MySong ms2 = new MySong("mr perfect","aarya","kumar",2010);
		MySong ms3 = new MySong("chammak challo","raone","Akon",2022);
		MySong ms4 = new MySong("hud hud dabang","dabang","sukhvinder singh",2012);
		MySong ms5 = new MySong("long drive","khiladi 786","mika singh",2015);
		MySong ms6 = new MySong("sajde","khatta meetha","shreya ghoshal",2011);
		
		DoublyLinkedList dllList = new DoublyLinkedList();
		dllList.showAllSongs();
		
		dllList.addSong(ms1);
		dllList.addSong(ms2);
		dllList.addSong(ms3);
		dllList.addSong(ms4);
		dllList.addSong(ms5);
		dllList.showAllSongs();
		System.out.println("----------------------------------");
		dllList.deleteBytitle("mr perfect");
		dllList.showAllSongs();
		System.out.println("-----------------------------------");
		
	}
}

class MySong
{
	//data part
	String title;
	String album;
	String artist;
	int year;
	
	//link part
	MySong prev;
	MySong next;
	public MySong(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MySong [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
}



class DoublyLinkedList
{
	MySong start = null, ptr, prev;
	boolean found =false;
	
	void addSong(MySong newSong) {
		
		if(start==null) {
			System.out.println("Juke box is empty....");
			start = newSong;
			start.prev = null;
			start.next = null;
			System.out.println("ADDED the FIRST Song.....");
		}
		else if (start.next == null ){
			start.next = newSong;
			newSong.prev = start;
			newSong.next = null;
			System.out.println("ADDED the SECOND Song.....");

		}
		else {
			
			ptr = start.next; // 200
			
			while(ptr.next!=null) { // 200!=null
				ptr=ptr.next;
			}
			
			ptr.next = newSong;
			newSong.prev = ptr;
			newSong.next = null;
			System.out.println("ADDED the INTERNAL Song.....");

		}
	}
	
		
			
	public void insertAfter(MySong ms, MySong ns) {
		ms.next= ns.next;
		ns.next.prev= ms;
		ns.next= ms;
		ms.prev = ns;
		System.out.println("inserted after: "+ns);
		System.out.println("Inserted......");
	}



	public void deleteBytitle(String title) {
		if(start==null) {
			System.out.println("List is empty...nothing to search");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.title.equals(title)) {
					found=true;
					break;
				}
				prev=ptr;
				ptr=ptr.next;
			}
			if(found==true) {
				prev.next=ptr.next;
				System.out.println("Internal song deleted....by title");
				ptr.next=null;
				ptr=null;
			}
			else {
			System.out.println("...owner name not found...");
			}
		}}
		
	

	void showAllSongs() {
		if(start==null) {
			System.out.println("Juke box is empty....");
		}
		else {
			
			ptr = start;
			
			while(ptr!=null) {
				System.out.println("DATA : "+ptr);
				System.out.println("-----------------------");
				ptr=ptr.next;
			}
		}
	}
}















