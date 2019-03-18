package Programs2;
import java.util.Scanner;
class LinkedList<T> {
	T data;
	LinkedList<T> next;

	LinkedList(T d) {
		data = d;
	}
}
public class Merge_2_Lists {
	
		static LinkedList createLinkedList() {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter data : ");
			int data = s.nextInt();
			LinkedList head = null;
			LinkedList temp=null;
			while (data != -1) {
				LinkedList node = new LinkedList(data);
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
		static void display(LinkedList head)
		{
			LinkedList temp=head;
			while(temp!=null){
				 System.out.print(temp.data+" ");
				 temp= temp.next;
				 }
		}
		public static LinkedList<Integer> mergeTwoList(LinkedList<Integer> head1, LinkedList<Integer> head2) {
		LinkedList<Integer> temp1=head1,temp2=head2,tail=null,head=null;
	      if(temp1.data.compareTo(temp2.data)>0)
	      {
	        head=temp2;
	        tail=temp2;
	        temp2=temp2.next;
	      }
	      else
	      {
	        head=temp1;
	        tail=temp1;
	        temp1=temp1.next;
	      }
	      while(temp1!=null&&temp2!=null)
	      {
	        if(temp1.data.compareTo(temp2.data)>0)
	        {
	          tail.next=temp2;
	          temp2=temp2.next;
	        }
	        else
	        {
				tail.next=temp1;
	            temp1=temp1.next;
	        }
	        tail=tail.next;
	      }
	      if(temp1!=null)
	      {
	        tail.next=temp1;
	      }
	      if(temp2!=null)
	      {
	        tail.next=temp2;
	      }
	      return head;
		}
		public static void main(String[] args) {
			System.out.println("Enter the elements of First Linked List in increasing order.");
			LinkedList head1 = createLinkedList();
			Scanner s=new Scanner(System.in);
			 LinkedList temp1 = head1;
			 System.out.println();
			 System.out.println("Enter the elements of Second Linked List in increasing order.");
			 LinkedList head2 = createLinkedList();
			 LinkedList temp2 = head2;
			 System.out.print("First Linked List formed is : ");
			 display(temp1);
			 System.out.println();
			 System.out.print("Second Linked List formed is : ");
			 display(temp2);
			 System.out.println();
			 System.out.print("Linked List formed after Merging both the Linked Lists in increasing order is : ");
			 LinkedList head3=mergeTwoList(head1, head2);
			 display(head3);
		}
	}
