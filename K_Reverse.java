package Programs2;
import java.util.Scanner;
class LL<T> {
	T data;
	LL<T> next;

	LL(T d) {
		data = d;
	}
}
public class K_Reverse {
	
		static LL createLinkedList() {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter data : ");
			int data = s.nextInt();
			LL head = null;
			LL temp=null;
			while (data != -1) {
				LL node = new LL(data);
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
		static void display(LL head)
		{
			LL temp=head;
			while(temp!=null){
				 System.out.print(temp.data+" ");
				 temp= temp.next;
				 }
		}
		public static LL<Integer> kReverse(LL<Integer> head, int k) {
		      LL<Integer> current = head;
				LL<Integer> next = null;
				LL<Integer> prev = null;		
					int count = 0;
				
					while (count < k && current != null) 
						{
							next = current.next;
							current.next = prev;
							prev = current;
							current = next;
							count++;
						}
				if (next != null) 
					head.next = kReverse(next, k);
				return prev;
		    }
		public static void main(String[] args) {
			LL head = createLinkedList();
			Scanner s=new Scanner(System.in);
			 LL temp = head;
			 System.out.println();
			 System.out.print("Linked List formed is : ");
			 display(temp);
			 System.out.println();
			 System.out.print("Enter the Number by which you want to reverse the elements of the List : ");
			 int k=s.nextInt();
			 temp=kReverse(temp, k);
			 System.out.print("List after reversing every "+k+" elements is : ");
			 display(temp);
		}
	}
