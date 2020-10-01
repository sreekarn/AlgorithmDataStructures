package linkedList;

public class DLL {
	
	class Node{
		int data;
		Node next;
		Node previous;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	Node head=null;
	Node tail=null;
	
	public void addnode(int data) {
		Node newnode=new Node(data);
		
		if(head==null) {
			head=tail=newnode;
			head.previous=null;
			tail.next=null;
		}
		else {
			tail.next=newnode;
			newnode.previous=tail;
			tail=newnode;
			tail.next=null;
		}
	}
	
	public void display() {
		if(head==null) {
			System.out.println("Empty");
			
		}else {
			Node current=head;
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
			
		}
	}
	
	public static void main(String args[]) {
		DLL list= new DLL();
		list.addnode(5);
		list.addnode(85);
		list.display();
		
	}
	
	
}
