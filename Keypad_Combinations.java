package Programs2;
import java.util.*;
public class Keypad_Combinations {
public static void main(String[] args) {
	int num;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter an integer number : ");
	num=s.nextInt();
	String[] arr=keypad(num);
	System.out.println("Keypad combinations which can be made of the integer number are : ");
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
}
	public static String[] keypad(int n){
	if(n==0)
    {
      String[] arr={""};
      return arr;
    }
 	String[] str=keypad(n/10);
       String word=num(n%10);
      String []ans=new String[str.length*word.length()];
      int k=0;
      for(int j=0;j<word.length();j++)
        for(int i=0;i<str.length;i++)
		ans[k++]=str[i]+word.charAt(j);
                     return ans;
    }
 public static String num(int m){
     String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      return arr[m];
  }
}
