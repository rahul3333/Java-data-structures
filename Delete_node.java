package Programs2;
import java.util.*;
class Node<T> {
	T data;
	Node<T> next;

	Node(T d) {
		data = d;
	}
}
public class Delete_node {
	static Node createLinkedList() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter data : ");
		int data = s.nextInt();
		Node head = null;
		Node temp=null;
		while (data != -1) {
			Node node = new Node(data);
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
	static void display(Node head)
	{
		Node temp=head;
		while(temp!=null){
			 System.out.print(temp.data+" ");
			 temp= temp.next;
			 }
	}
	public static Node<Integer> deleteIthNode(Node<Integer> head, int i)	//Function to delete a node
	{
		Node temp=head,temp2=head;
		int count=0,c1=0;
      while(temp2!=null)
      {
        c1++;
        temp2=temp2.next;
      }
      	if(i==0)
        {
          head=head.next;
          return head;
        }
      else if(i>0&&i<c1)
      {
        while(count<i-1)
		{
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
      }
      	return head;
	}
	public static void main(String[] args) {
		Node head = createLinkedList();
		Scanner s=new Scanner(System.in);
		 Node temp = head;
		 System.out.println();
		 System.out.print("Linked List formed is : ");
		 display(temp);
		 System.out.println();
		 System.out.print("Enter the Position from where you want to delete the node : ");
		 int pos=s.nextInt();
		 head=deleteIthNode(temp, pos-1);
		 System.out.print("Linked List after deletion of a node from position "+pos+" is : ");
		 display(head);
	}
}
