package Programs2;
import java.util.Scanner;
class node<T> {
	T data;
	node<T> next;

	node(T d) {
		data = d;
	}
}
public class Rearrange_List {	
		static node createLinkedList() {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter data : ");
			int data = s.nextInt();
			node head = null;
			node temp=null;
			while (data != -1) {
				node node = new node(data);
				if (head == null) {
					head = node;
					temp=head;
				} else {
					temp.next=node;
					temp=temp.next;
				}
				System.out.print("Enter next data : ");
				data = s.nextInt();
			}
			return head;
	}
		static void display(node head)
		{
			node temp=head;
			while(temp!=null){
				 System.out.print(temp.data+" ");
				 temp= temp.next;
				 }
		}
		public static node<Integer> changelist(node<Integer> head) {
		node<Integer> temp=head,temp2=null,prev=null;
	      node<Integer> node =new node<>(0);
	      node<Integer> curr=node;
	      temp2=printMiddel(head);
	      temp2=temp2.next;
	      while(temp.next!=temp2)
	        temp=temp.next;
	      temp.next=null;
	      temp=head;
	      temp2=rev(temp2);
	      while(temp!=null||temp2!=null)
	      {
	        if(temp!=null)
	        {
	          curr.next=temp;
	          curr=curr.next;
	          temp=temp.next;
	        }
	        if(temp2!=null)
	        {
	          curr.next=temp2;
	          curr=curr.next;
	          temp2=temp2.next;
	        }
	        node=node.next;
	      }
	      return head;
		}
	  public static node<Integer> printMiddel(node<Integer> head) {
	      node temp=head;
	      node<Integer> slow=head,fast=head.next;
	      while(fast!=null&&fast.next!=null)
	      {
	        slow=slow.next;
	        fast=fast.next.next;
	      }
	      return slow;
	    }
	  public static node<Integer> rev(node<Integer> head) {
			if(head.next==null)
	          return head;
	    	node<Integer> temp= rev(head.next);
	      head.next.next=head;
	      head.next=null;
	      return temp;
	}
		public static void main(String[] args) {
			node head = createLinkedList();
			Scanner s=new Scanner(System.in);
			 node temp = head;
			 System.out.println();
			 System.out.print("Linked List formed is : ");
			 display(temp);
			 System.out.println();
			 temp=changelist(temp);
			 System.out.print("Updated List is : ");
			 display(temp);
		}

}
