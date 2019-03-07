package Programs2;
import java.util.*;
public class Print_Codes {
	public static void main(String[] args) {
		System.out.print("Enter a numeric String : ");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println("Codes made using numeric string "+input+" are : ");
		printAllPossibleCodes(input);
	}
	static char mapping(int n) {
		return (char)('a'+n-1);
	}

public static void printAllPossibleCodes(String input) {
	// Write your code here
  String temp="";
  codes(input,temp);

}
static void codes(String S,String temp) {
	 if(S.length()==0) {
		 System.out.println(temp);
		 return;
	 }
	 int n1=S.charAt(0)-'0';
	 char R1=mapping(n1);
	 codes(S.substring(1), temp+R1);
	 if(S.length()!=1) 
	 {
		 int n2=(S.charAt(0)-'0')*10+(S.charAt(1)-'0');
		 if(n2<=26) {
			 char R2=mapping(n2);
			 codes(S.substring(2),temp+R2);
		 }
	 }
	 
 }
}
