package Programs2;
import java.util.*;
public class Equillibrium_index {
	public static void main(String[] args) {
		int size=0;
		System.out.print("Enter the size of the array : ");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int arr[]=new int[size];
		input(arr,size);
		int ans=equillibrium(arr,size);
		System.out.println();
		if(ans!=-1)
			System.out.print("Equillibrium index in the array is : "+ans);
		else
			System.out.println("No Equillibrium index in the array");
	}
	public static void input(int arr[],int size)
	{
		Scanner s=new Scanner(System.in);
		int j=1;
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the element "+ j++ +" of the array : ");
			arr[i]=s.nextInt();
		}
		System.out.print("Array formed is : ");
		display(arr,size);
	}
	public static void display(int[] arr, int size) {
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+"  ");
	}
	public static int equillibrium(int arr[],int n)
	{
		int rightsum=0,leftsum=0;
		for(int i=0;i<n;i++)
			rightsum+=arr[i];
		for(int i=0;i<n;i++)
		{
			rightsum-=arr[i];
			if(leftsum==rightsum)
				return i;
			leftsum+=arr[i];
		}
		return -1;
	}
}
