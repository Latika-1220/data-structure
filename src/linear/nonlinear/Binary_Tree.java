package nonlinear;
import java.util.Queue;
import java.util.LinkedList;
class TNode{
	int data;
	TNode left,right;
	public TNode(int data) {
		this.data=data;
		left=right=null;
	}
}
public class Binary_Tree {
	static TNode root;
	public static void insert(int data) {
		TNode node=new TNode(data);
		if(root==null) {
			root=node;
		}
		else {
			Queue<TNode> track = new LinkedList<>();
			track.add(root);
			while(!track.isEmpty()) {
				TNode current=track.poll();
				if(current.left==null) {
					current.left=node;
					break;
				}
				else {
					track.add(current.left);
				}
				if(current.right==null) {
					current.right=node;
					break;
				}
				else {
					track.add(current.right);
				}
			}
		}
	}
	public static void preOrder(TNode root){
		if(root!=null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void postOrder(TNode root){
		if(root!=null) {
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public static void inOrder(TNode root){
		if(root!=null) {
			preOrder(root.left);
			System.out.print(root.data+" ");
			preOrder(root.right);
		}
	}
	public static boolean search(TNode root,int data){
		if(root!=null) {
			if(root.data==data) {
				return true;
			}
			return search(root.left,data)||search(root.right,data);
		}
		return false;
	}
	public static void main(String[] args) {
		insert(15);
		insert(8);
		insert(20);
		insert(12);
		insert(6);
		insert(4);
		insert(16);
		System.out.print("Pre Order:");
		preOrder(root);
		System.out.println();
		System.out.print("Post Order:");
		postOrder(root);
		System.out.println();
		System.out.print("In Order:");
		inOrder(root);
		System.out.println();
     System.out.println(search(root,12));
	}
}
