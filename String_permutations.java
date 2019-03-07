package Programs2;
//Q-Given a string, find and print all the possible permutations of the input string.
import java.util.*;
public class String_permutations {
	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println("Permutations of "+input+" are : ");
		permutations(input);
	}
	public static void permutations(String input){
		String str="";
      keypad(input,str);
	}
  static void keypad(String input,String result)
	{
		if(input.length()==0)
		{
			System.out.println(result);
			return;
		}
		for(int i=0;i<input.length();i++)
			keypad(input.substring(0, i)+input.substring(i+1),result+input.charAt(i));
	}
}
