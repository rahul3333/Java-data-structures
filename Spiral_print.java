package Programs2;
import java.util.*;
public class Spiral_print {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows in the array : ");
		Scanner s=new Scanner(System.in);
		int size1=s.nextInt();
		System.out.print("Enter the number of columns in the array : ");
		int size2=s.nextInt();
		int arr[][]=new int[size1][size2];
		input(arr,size1,size2);
		System.out.println();
		System.out.print("Array in Spiral form is : ");
		spiralPrint(arr);
	}
	public static void input(int arr[][],int size1,int size2)
	{
		Scanner s=new Scanner(System.in);
		int ele=1;
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++) 
			{
			System.out.print("Enter the element "+ ele++ +" of the array : ");
			arr[i][j]=s.nextInt();
			}
		}
		System.out.print("Array formed is : ");
		display(arr,size1,size2);
	}
	public static void display(int[][] arr, int size1,int size2) {
		for(int i=0;i<size1;i++)
			for(int j=0;j<size2;j++)
				System.out.print(arr[i][j]+"  ");
	}
	public static void spiralPrint(int arr[][]){
int k=0,i,j,l=0;
      int n=arr.length;
      int m=arr[0].length;
		while(k<n&&l<m)
		{
			for(i=l;i<m;++i)
				System.out.print(arr[k][i]+" ");
		k++;
		for(i=k;i<n;++i)
			System.out.print(arr[i][m-1]+" ");
		m--;
		if(k<n)
		{
			for(i=m-1;i>=l;--i)
				System.out.print(arr[n-1][i]+" ");
			n--;
		}
		if(l<m)
		{
			for(i=n-1;i>=k;--i)
				System.out.print(arr[i][l]+" ");
			l++;
		}
	}
}
}
