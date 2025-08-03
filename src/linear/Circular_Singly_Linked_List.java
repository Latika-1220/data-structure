package linear;
class CirNode{
    int data;
    CirNode next;
    public CirNode(int data) {
        this.data=data;
        next=null;
    }
}
class CirMethods{
    static CirNode head,tail;
    public static void insertAtbeg(int data) {
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
            tail.next=head;
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
    public static void insertAtPos(int data,int pos){
        CirNode newNode = new CirNode(data);
        if (pos == 0) {
            insertAtbeg(data);
            return;
        }
        else {
            CirNode temp = head;
            for(int i=0; i<pos; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
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
        CirNode temp=head;
        if(head==null && tail==null) {
            System.out.print("The list is Empty");
        }else {
            while(temp.next.next!=head) {
                temp=temp.next;
            }temp.next=head;
            
        }
    }
    public static void deleteAtPos(int pos) {
        if(pos==0) {
            deleteAtBeg();
        }
        else {
            CirNode temp=head;
            for(int i=1;i<pos;i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    
    public static void display() {
        CirNode temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next;
        } while(temp!=head) ;
        System.out.println();
    }
}
public class Circular_Singly_Linked_List extends CirMethods {

    public static void main(String[] args) {
        insertAtbeg(5);
        insertAtbeg(15);
        insertAtEnd(25);
        insertAtEnd(35);
        insertAtPos(45,2);
        deleteAtBeg();
        deleteAtEnd();
        deleteAtPos(2);
        display();

    }

}
