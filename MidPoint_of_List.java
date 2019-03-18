package Programs2;
import java.util.Scanner;
class List<T> {
	T data;
	List<T> next;

	List(T d) {
		data = d;
	}
}
public class MidPoint_of_List {
	
		static List createLinkedList() {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter data : ");
			int data = s.nextInt();
			List head = null;
			List temp=null;
			while (data != -1) {
				List node = new List(data);
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
		static void display(List head)
		{
			List temp=head;
			while(temp!=null){
				 System.out.print(temp.data+" ");
				 temp= temp.next;
				 }
		}
		public static int printMiddel(List<Integer> head) {
		      List temp=head;
		      List<Integer> slow=head,fast=head.next;
		      while(fast!=null&&fast.next!=null)
		      {
		        slow=slow.next;
		        fast=fast.next.next;
		      }
		      return slow.data;
		    }
		public static void main(String[] args) {
			List head = createLinkedList();
			Scanner s=new Scanner(System.in);
			 List temp = head;
			 System.out.println();
			 System.out.print("Linked List formed is : ");
			 display(temp);
			 System.out.println();
			 System.out.print("Middle Element of the Linked List is : "+printMiddel(head));
		}
	}
