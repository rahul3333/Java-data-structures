package Programs2;
import java.util.*;
public class Print_Subsequences {
public static void main(String[] args) {
	System.out.print("Enter a String : ");
	Scanner s=new Scanner(System.in);
	String input=s.nextLine();
	System.out.println("Subsequences of "+input+" are : ");
	printSubsequences(input);
}
public static void printSubsequences(String input) {
	String res= "";
  fun(input,res);
	
}
static void fun(String input,String res){
	if (input.length()==0){
		for (int w=0;w<res.length();w++) 
			System.out.print(res.charAt(w));
		System.out.println();
		return;}
	
	fun(input.substring(1),res+input.charAt(0));
	fun(input.substring(1),res);
}	
}
