package Programs2;
import java.util.Scanner;
class node<T> {
	T data;
	node<T> next;

	node(T d) {
		data = d;
	}
}
public class Even_After_Odd {	
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
		public static node<Integer> sortEvenOdd(node<Integer> head) {
			node<Integer> end = head;
				node<Integer> prev = null;
				node<Integer> curr = head;
					while (end.next != null)
						end = end.next;
					node<Integer> end2 = end;
					while (curr.data %2 ==0 && curr != end)
						{
							end2.next = curr;
							curr = curr.next;
							end2.next.next = null;
							end2 = end2.next;
						}
					if (curr.data %2 !=0)
						{
							head = curr;
							 while (curr != end)
							 	{
								 	if (curr.data % 2 != 0)
								 		{
								 			prev = curr;
								 			curr = curr.next;
								 		}
								 	else
										{
											prev.next = curr.next;
											curr.next = null;
											end2.next = curr;
											end2 = curr;
											curr = prev.next;
										}
							 	}
						}
					else
						prev = curr;
					 if (end2 != end && end.data %2 == 0)
								{
						 			prev.next = end.next;
						 			end.next = null;
						 			end2.next = end;
								}
					 return head;
			}
		public static void main(String[] args) {
			node head = createLinkedList();
			Scanner s=new Scanner(System.in);
			 node temp = head;
			 System.out.println();
			 System.out.print("Linked List formed is : ");
			 display(temp);
			 System.out.println();
			 temp=sortEvenOdd(temp);
			 System.out.print("List after sorting all Even elements after all Odd elements is : ");
			 display(temp);
		}

}
