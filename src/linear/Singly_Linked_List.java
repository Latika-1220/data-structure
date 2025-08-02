package linear;
//node class
class Node{
	int data;
	Node next;//he is just reference variable for node class
	//he initialze the instance variable
	public Node(int data) {//Constructor
		this.data=data;
		next  = null;
	}
}
//method class
class Methods{
	static Node head = null;
	static int count=0;
	public static void insertAtBeg(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}else {
		newNode.next=head;
		head=newNode;                                                   
		}
		count++;
//		System.out.println(count);
//		System.out.println(newNode.next);
//		System.out.println(newNode.data);
//		System.out.println(newNode.next);
	}
	public static void insertAtEnd(int data){
		Node newNode=new Node(data);
		Node temp=head;
		if(head==null) {
			head=newNode;
			count++;
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		count++;
	}
	public static void insertAtPos(int data,int pos) {
		Node newNode=new Node(data);
		Node temp=head;
		if(head==null && pos!=0) {
			System.out.println("invalid position");
			return;
		}
		if(pos==0) {
			insertAtBeg(data);
			System.out.println(pos);
			return;
		}
		for(int i=0;i<pos-1;i++) {
			if(temp.next==null) {
				System.out.println("invalid pos");
				return;
			}
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode; 
		
	}
	public static void deleteAtBeg() {
		Node temp = head;
		head=head.next;
		temp.next=null;
		count--;
	}
	public static void deleteAtEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		count--;
	}
	public static void deleteAtPos(int pos) {
		Node temp=head;
		if(pos==0) {
			deleteAtBeg();
		}
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		count--;
	}
	public static void display(){
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
		System.out.println("The length of the list:"+count);
	}
}
//main class
public class Singly_Linked_List extends Methods {
	public static void main(String[] args) {
		insertAtBeg(3);
		insertAtBeg(2);
		insertAtBeg(1);
		insertAtBeg(0);
		insertAtEnd(63);
		insertAtPos(11,3);
		deleteAtBeg();
		deleteAtEnd();
		deleteAtPos(3);
		display();
	}                                    	
}
