package linear;
class CirNode{
	int data;
	CirNode next;
	public CirNode(int data) {
		this.data=data;
	}
}
class CirMethods{
	static CirNode head,tail;
	public static void insertAtBeg(int data) {
		CirNode node=new CirNode(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
			return;
		}
		else {
			node.next=head;
			head=node;
			tail.next=node;
		}
	}
	
	public static void insertAtEnd(int data) {
		CirNode node=new CirNode(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
			return;
		}
		else {
			tail.next=node;
			node.next=head;
			tail=node;
		}
	}
	public static void insertAtPos() {
		
	}
	public static void deleteAtBeg() {
		CirNode temp=head;
		if(head==null && tail==null) {
			System.out.println("List is Empty");
		}
		else {
			tail.next=head.next;
			head=head.next;
			temp.next=null;
		}
		
	}
	public static void deleteAtEnd() {
		
	}
	public static void deleteAtPos() {
		
	}
	public static void display() {
		CirNode temp=head;
		do {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}while(temp!=head);
	}
}
public class Circular_Singly_Linked_List extends CirMethods {
    public static void main(String[] args) {
    	insertAtBeg(5);
    	insertAtBeg(4);
    	insertAtBeg(3);
    	insertAtBeg(2);
    	insertAtBeg(1);
    	deleteAtBeg();
    	display();
}
}
