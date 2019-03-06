package Programs2;
import java.util.*;
public class String_Compression {
	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=compress(str);
		System.out.print("String after compressing each word is : ");
		System.out.println(ans);
	}
	public static String compress(String input) {
String str="";
		int n=input.length();
      int i,j,count=0;
      for(i=0;i<n;i++)
		{	count=1;
			for(j=i+1;j<n;j++)
			{
				if(input.charAt(i)==input.charAt(j))
				{
					count++;
					i++;
				}
				else
					break;
			}
					if(count>1)
					{
						str+=input.charAt(i);
						str+=count;
					}
					else
						str+=input.charAt(i);
		}
      return str;
	}
}
