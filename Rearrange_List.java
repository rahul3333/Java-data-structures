package Programs2;
import java.util.Scanner;
class ListNode<T> {
	T data;
	ListNode<T> next;

	ListNode(T d) {
		data = d;
	}
}
public class Rearrange_List {
	static ListNode createLinkedList() {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter data : ");
	int data = s.nextInt();
	ListNode head = null;
	ListNode temp=null;
	while (data != -1) {
		ListNode node = new ListNode(data);
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
static void display(ListNode head)
{
	ListNode temp=head;
	while(temp!=null){
		 System.out.print(temp.data+" ");
		 temp= temp.next;
		 }
}
public static ListNode<Integer> changelist(ListNode<Integer> head) {
	// Write your code here
ListNode<Integer> temp=head,temp2=null,prev=null;
  ListNode<Integer> node =new ListNode<>(0);
  ListNode<Integer> curr=node;
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
public static ListNode<Integer> printMiddel(ListNode<Integer> head) {
  ListNode temp=head;
  ListNode<Integer> slow=head,fast=head.next;
  while(fast!=null&&fast.next!=null)
  {
    slow=slow.next;
    fast=fast.next.next;
  }
  return slow;
}
public static ListNode<Integer> rev(ListNode<Integer> head) {
	if(head.next==null)
      return head;
	ListNode<Integer> temp= rev(head.next);
  head.next.next=head;
  head.next=null;
  return temp;
}
public static void main(String[] args) {
	ListNode head = createLinkedList();
	Scanner s=new Scanner(System.in);
	 ListNode temp = head;
	 System.out.println();
	 System.out.print("Linked List formed is : ");
	 display(temp);
	 System.out.println();
	 temp=changelist(temp);
	 System.out.print("Updated List is : ");
	 display(temp);
}
}