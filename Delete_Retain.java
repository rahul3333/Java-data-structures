package Programs2;
import java.util.Scanner;
class node<T> {
	T data;
	node<T> next;

	node(T d) {
		data = d;
	}
}
public class Delete_Retain {	
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
		public static node<Integer> delret(node<Integer> head, int M, int N) {
			node<Integer> temp=head,temp1=head,temp2=null;
	      if(M==0)
	        return temp2;
	      if(N==0)
	        return head;
		      while(temp.next!=null)
		      {
		       int count=0,c=0;
		        while(count<M-1 && temp.next!=null)
		        {
		        	temp=temp.next;
		          count++;
		        }
		        temp1=temp;
		        while(c<N&&temp1.next!=null)
		        {
		          temp1=temp1.next;
		          c++;
		        }
		        if(temp1.next!=null) {
		        	
		        temp.next=temp1.next;  
	              temp=temp.next;
		        }
		        else
		        	{
		        	temp.next=null;
		        	}
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
			 System.out.print("Enter the number of nodes to be Retained : ");
			 int M=s.nextInt();
			 System.out.print("Enter the number of nodes to be Deleted : ");
			 int N=s.nextInt();
			 temp=delret(temp, M, N);
			 System.out.print("List After Retaining every "+M+" nodes and Deleting every "+N+" nodes is : ");
			 display(temp);
		}
}
