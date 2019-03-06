package Programs2;
import java.util.*;
public class Pallindrome {
	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(checkPalindrome(str))
			System.out.println("Entered string is a Pallindrome");
		else
			System.out.println("Entered string is not a Pallindrome");
	}
	public static boolean checkPalindrome(String str){
		int n=str.length();
      int flag=0;
      int i,j;
		for(i=0,j=n-1;i<n/2;i++,j--)
		{
			if(str.charAt(i)==str.charAt(j))
				flag++;
			else
			{
				flag=0;
				break;
			}
		}
		if(flag>0)
			return true ;
		else
			return false ;

	}
}
