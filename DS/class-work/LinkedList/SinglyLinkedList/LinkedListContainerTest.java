package datastructuremodule;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListContainerTest {
	public static void main(String[] args) {
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","John",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",75,true);
		Kite k6 = new Kite("White","Julie",175,true);
		
		MyLinkedList myList = new MyLinkedList();
				
		myList.showList();
		
		myList.add(k1);
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);
		
		myList.showList();
		
		System.out.println("===========================================================================");
		
		
		
		myList.addAtBegining(k6);
		myList.showList();
		System.out.println("===========================================================================");
		myList.searchKiteByLength(60);
		System.out.println("===========================================================================");
		myList.searchKiteByOwner("John");
		System.out.println("===========================================================================");
		myList.searchKiteByColor("White");
		System.out.println("===========================================================================");
		myList.updateByOwner("John","Surya");
		System.out.println("===========================================================================");
		myList.updateByOwner("Julie","Parag");
		System.out.println("===========================================================================");
		myList.deleteByOwnerName("Jack");
		myList.showList();
		myList.insertKite("Jim", k6);
		myList.showList();
		}
		
	}

class MyLinkedList
{
	Kite start,ptr,prev;
	boolean found=false;

	void showList() {
		if(start==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
			ptr = start;
			while(ptr!=null) {
				System.out.println("DATA :"+ptr);
				ptr=ptr.next;
			}}
			}
		void insertKite(String ownerToFind, Kite newKite) { //julie, k6
		
		boolean found=false;
		
		if(start == null) {
			System.out.println("List is empty...cannot add this object...");
		}
		else if(start.owner.equals(ownerToFind)){
			addAtBegining(newKite);
		}
		else {
			ptr = start; //100
			while(ptr!=null) {
				if(ptr.owner.equals(ownerToFind)) {
					found = true;
					
					break;
				}
				prev = ptr;
				ptr=ptr.next;
			}
			if(found==true) {
				prev.next = newKite;
				newKite.next = ptr;
				System.out.println("Object INSERTED before....."+ownerToFind);
			}
			else {
				System.out.println("Object not found ...."+ownerToFind);
			}
		}
				
		
	}
			void deleteByOwnerName(String ownerName) {
				if(start==null) {
					System.out.println("List is empty...nothing to search");
				}
				else {
					ptr=start;
					while(ptr!=null) {
						if(ptr.owner.equals(ownerName)) {
							found=true;
							break;
						}
						prev=ptr;
						ptr=ptr.next;
					}
					if(found==true) {
						prev.next=ptr.next;
						System.out.println("Internal object deleted..by ownername");
						ptr.next=null;
						ptr=null;
					}
					else {
					System.out.println("...owner name not found...");
					}
				}}
					
			 void updateByOwner(String owner1, String owner2) {
				if(start==null) {
					System.out.println("List is empty...nothing to search");
				}
				else {
					System.out.println("List is not empty");
					ptr=start;
					while(ptr!=null) {
						if(ptr.owner==owner1)
						{
							ptr.owner=owner2;
							
							break;
						}
						ptr=ptr.next;
					}
					System.out.println("Owner change " +owner1+ " to " +owner2);
				}
		
	}
			 void searchKiteByColor(String colorToSearch) {
				boolean found = false;
				if(start==null) {
					System.out.println("List is empty...nothing to search");
				}
				else {
					System.out.println("List is not empty...searching...");
					ptr=start;
					while(ptr!=null) {
						if(ptr.color==colorToSearch) {
							System.out.println("Kite Found : "+ptr);
							found=true;
							break;
						}
						ptr=ptr.next;
					}
					if(found!=true) {
						System.out.println("Kite not found... of this color : "+colorToSearch);
					}
				}
		
	}
			 void searchKiteByOwner(String ownerToSearch) {
				boolean found=false;
				
				if(start==null) {
					System.out.println("List is empty..nothing to search");
				}
				else {
					System.out.println("List is not empty...searching...");
					ptr = start;
					
					while(ptr!=null) {
						if(ptr.owner == ownerToSearch) {
							System.out.println("Kite Found :"+ptr);
							found=true;
							break;
						}
						ptr=ptr.next;
					}
					if(found!=true) {
						System.out.println("Kite not found... of this owner name : "+ownerToSearch);
					}}
	}
			void searchKiteByLength(int lengthToSearch) {
				
				boolean found=false;
				
				if(start==null) {
					System.out.println("List is empty..nothing to search");
				}
				else {
					System.out.println("List is not empty...searching...");
					ptr = start;
					while(ptr!=null) {
						if(ptr.length == lengthToSearch) {
							System.out.println("Kite Found :"+ptr);
							found=true;
							break;
						}
						ptr=ptr.next;
					}
					if(found!=true) {
						System.out.println("Kite not found... of this length : "+lengthToSearch);
					}
				}
			}
			
			void addAtBegining(Kite newKite) {
				if(start!=null) {
					System.out.println("This kite is added at the beginning of the existing list of kites...");
					newKite.next = start;
					start = newKite;
				}
				else {
					System.out.println("You are the first kite..");
					start = newKite;
				}
			}
		
	
	void add(Kite newKite) { //200
		if(start==null) {
			System.out.println("Adding first node...");
			start = newKite;
			//start.next = null;
		}
		else {		
			System.out.println("Adding internal node...");
			ptr=start;
			while(ptr!=null) {
				System.out.println("Searching....");
				prev = ptr;
				ptr=ptr.next;
			}
			prev.next = newKite;
			newKite.next = null;
		}
	}
	
}
