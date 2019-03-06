package Programs2;
import java.util.*;
public class Wave_print {
public static void main(String[] args) {
	System.out.print("Enter the number of rows in the array : ");
	Scanner s=new Scanner(System.in);
	int size1=s.nextInt();
	System.out.print("Enter the number of columns in the array : ");
	int size2=s.nextInt();
	int arr[][]=new int[size1][size2];
	input(arr,size1,size2);
	System.out.println();
	System.out.print("Array in sine wave form is : ");
	wavePrint(arr);
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
public static void wavePrint(int arr[][]){	
	int i,j;
for(i=0;i<arr[0].length;i++)
	{
		if(i%2==0)
		{
			for(j=0;j<arr.length;j++)
				System.out.print(arr[j][i]+" ");
		}
		else
			for(j=arr.length-1;j>=0;j--)
				System.out.print(arr[j][i]+" ");
	}
}
}
