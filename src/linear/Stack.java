package linear;
class SNode{
	int data;
	SNode next;
	public SNode(int data) {
		this.data=data;
	}
}
public class Stack {
	static SNode top,bottom;
	static int count = -1;
		public static void pop() {
			if(count==-1) {
				System.out.println("Stack is empty");
				return;
			}	
			else {
				SNode temp=bottom;
				while(temp.next.next!=null) {
					temp=temp.next;
				}
				System.out.println("Popped data"+top.data);
				top=temp;
				temp.next=null;
				count--;
				
			}
		}
		public static void push(int data) {
		SNode node=new SNode(data);
		if(top==null) {
			top=node;
			return;
		}
		else {
			top.next=node;
			top=node;
		}
	}
	public static void main(String[] args) {
		push(5);
		push(10);
		pop();
		pop();
	}
}
