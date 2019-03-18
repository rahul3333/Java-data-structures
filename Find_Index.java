package Programs2;
import java.util.Scanner;
class Linked<T> {
	T data;
	Linked<T> next;

	Linked(T d) {
		data = d;
	}
}
public class Find_Index {
	
		static Linked createLinkedList() {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter data : ");
			int data = s.nextInt();
			Linked head = null;
			Linked temp=null;
			while (data != -1) {
				Linked node = new Linked(data);
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
		static void display(Linked head)
		{
			Linked temp=head;
			while(temp!=null){
				 System.out.print(temp.data+" ");
				 temp= temp.next;
				 }
		}
		public static int indexOfNIter(Linked<Integer> head, int n) {
	      Linked<Integer> temp=head;
	      int count=0;
	      while(temp!=null&&temp.data!=n)
	      {
	        count++;
	        temp=temp.next;
	      }
	      if(temp==null)
	      {
	        return -1;
	      }
	      else
	      {
	        return count;
	      }
		}
		public static void main(String[] args) {
			Linked head = createLinkedList();
			Scanner s=new Scanner(System.in);
			 Linked temp = head;
			 System.out.println();
			 System.out.print("Linked List formed is : ");
			 display(temp);
			 System.out.println();
			 System.out.print("Enter the Element whose index you want to search : ");
			 int ele=s.nextInt();
			 System.out.print(ele+" is at index : "+indexOfNIter(head, ele));
		}
	}
