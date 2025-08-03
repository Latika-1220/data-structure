package linear;

class SNode{
	int data;
	SNode next;
	public SNode(int data) {
		this.data = data;
		this.next = null;
	}
}

class StackOps{
	static SNode top, bottom;
	static int len=-1;
	
	public static void Push(int data) {
		SNode node = new SNode(data);
		if(top == null) {
			top = node;
			bottom = node;
		}else {
			top.next=node;
			top = node;
		}
		len++;
	}
	
	public static void Pop() {
		if(len==-1) {
			System.out.println("Stack Underflow");
			return;
		}else if(len==0){
			System.out.println("Popped: "+top.data);
			bottom = null;
			len--;
			return;
		}
		{
			System.out.println("Popped: "+top.data);
			SNode temp = bottom;
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			top = temp;
			temp.next = null;
		}
		len--;
	}
	
	public static void Peak() {
		if(len==-1) {
			System.out.println("Nothing to peak!");
			return;
		}else {
			System.out.println("Toppest data: "+top.data);
		}
	}
	
	public static void display() {
		SNode temp = bottom;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class Stack extends StackOps{
	public static void main(String[] args) {
		Push(2);
		Push(3);
		Push(4);
		Push(6);
		Peak();
		display();
	}

}
