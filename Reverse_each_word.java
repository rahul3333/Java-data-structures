package Programs2;
import java.util.*;
public class Reverse_each_word {
public static void main(String[] args) {
	System.out.print("Enter a String : ");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String ans=reverseEachWord(str);
	System.out.print("String after reversing each word is : ");
	System.out.println(ans);
}
public static String reverseEachWord(String input) {
  input=" "+input;
	String str1="";
	String str2="";
int i=0,j=0,l=input.length();
for(i=input.length()-1;i>=0;i--)
{
	while(input.charAt(i)!=' ')
		{
		i--;
		if(i==-1)
			{
			i=0;
			break;
			}
		}
	str2+=input.substring(i,l);
	l=i;
}
for(i=str2.length()-1;i>=0;i--)
{	
		str1+=str2.charAt(i);
}
int v=str1.length()-1;
String str3=str1.substring(0,v);
return str3;
}
}
