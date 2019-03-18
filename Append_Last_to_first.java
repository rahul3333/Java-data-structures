package Programs2;
import java.util.Scanner;
class node<T> {
	T data;
	node<T> next;

	node(T d) {
		data = d;
	}
}
public class Append_Last_to_first {	
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
		public static node<Integer> append(node<Integer> root, int n) {
			node<Integer> temp=root,temp1=root,temp2=null,temp3=null;
		      int count=0,c=0;
		      while(temp!=null)
		      {
		        count++;
		        temp=temp.next;
		      }
		      c=count;
		      temp=root;
		      while(c>n)
		      {
		        temp1=temp;
	            temp=temp.next;
		        c--;
		      }
		      temp3=temp;
	      		temp1.next=null;
		      while(temp.next!=null)
		    	  temp=temp.next;
		      temp.next=root;
		      return temp3;
		    }
		public static void main(String[] args) {
			node head = createLinkedList();
			Scanner s=new Scanner(System.in);
			 node temp = head;
			 System.out.println();
			 System.out.print("Linked List formed is : ");
			 display(temp);
			 System.out.println();
			 System.out.print("How many last elements of the List you want to append to front : ");
			 int k=s.nextInt();
			 temp=append(temp, k);
			 System.out.print("List after appending Last "+k+" elements to front is : ");
			 display(temp);
		}

}
