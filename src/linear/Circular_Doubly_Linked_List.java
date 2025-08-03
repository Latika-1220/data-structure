package linear;
class CirDubNode{
    int data;
    CirDubNode next,prev;
    public CirDubNode(int data) {
        this.data=data;
        next=null;
        prev=null;
    }
}
class CirDubMethods{
    static CirDubNode head,tail;
    static int count=0;
    public static void insertAtBeg(int data) {
        CirDubNode newnode=new CirDubNode(data);
            if(head==null && tail==null) {
                head=newnode;
                tail=newnode;
                head.next=newnode;
                head.prev=newnode;
            }else {
                newnode.next=head;
                newnode.prev=tail;
                tail.next=newnode;
                head.prev=newnode;
                head=newnode;
            }count++;
    }public static void insertAtEnd(int data) {
        CirDubNode newnode=new CirDubNode(data);
        if(head==null && tail==null) {
            insertAtBeg(data);
        }else {
            tail.next=newnode;
            newnode.prev=tail;
            head.prev=newnode;
            newnode.next=head;
            tail=newnode;
        }count++;
}public static void insertAtpos(int data,int pos) {
    CirDubNode newnode=new CirDubNode(data);
    if(pos==0) {
        insertAtBeg(data);
    }
   else {    
        CirDubNode temp=head;
        for(int i=1;i<pos;i++) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
        count++;
    }
}public static void deletionAtBeg() {
    if(head==null && tail==null) {
        System.out.printf("the List is empty");
    }else {
        tail.next=head.next;
        head.next.prev=tail;
        head=head.next;
        
    }count--;
}public static void deletionAtEnd() {
    if(head==null && tail==null) {
        System.out.printf("the List is empty");
    }else {
        tail.prev.next=head;
        head.prev=tail.prev;
        tail=tail.prev;
    }count--;
}public static void deletionAtpos(int pos) {
    if(pos==0) {
        deletionAtBeg();
    }else{
        CirDubNode temp=head;
        for(int i=1;i<pos;i++) {
            temp=temp.next;
        }temp.next=temp.next.next;
        count--;
    }
}public static void display() {
        CirDubNode temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
        System.out.print("The length of the list: "+count);
    }
}
    

public class Circular_Doubly_Linked_List extends CirDubMethods  {

    public static void main(String[] args) {
        insertAtBeg(7);
        insertAtBeg(8);
        insertAtEnd(9);
        insertAtEnd(10);
        insertAtBeg(4);
        insertAtpos(2,0);
        insertAtEnd(6);
        insertAtBeg(1);
        deletionAtBeg();
        deletionAtEnd();
        deletionAtEnd();
        deletionAtpos(1);
        display();
    
    }

}