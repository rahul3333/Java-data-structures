package Programs2;
import java.util.*;
public class subset_sum_to_k {
	public static void main(String[] args) {
		int size=0;
		System.out.print("Enter the size of the array : ");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int arr[]=new int[size];
		input(arr,size);
		System.out.print("Enter the number for which you want the subsets of the array : ");
		int num=s.nextInt();
		System.out.println("Subsets of the array which sum to "+num+" are : ");
		printSubsetsSumTok(arr, num);
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
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		int[]res={};
      fun(input,res,k);
		
	}
  static void fun (int []input,int []res,int k){
		if (input.length==0){
				int sum=0;
			for (int x=0;x<res.length;x++)
			sum+=res[x];
		  if(sum==k) {
			for (int w=0;w<res.length;w++) 
				System.out.print(res[w]+" ");
			System.out.println();
			return;}
        else{
          return;
        }}
		int result []=new int [res.length+1];
		for (int w=0;w<res.length;w++) {
			result[w]=res[w];
		}
			result[res.length]=input[0];
		
		int []ans=new int [input.length-1];
		for (int i=1;i<input.length;i++){
			ans[i-1]=input[i];
		}
		fun(ans,res,k);
		fun(ans,result,k);
	}	
}
