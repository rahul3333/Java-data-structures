package Programs2;
import java.util.*;
public class All_Substrings {
public static void main(String[] args) {
	System.out.print("Enter a String : ");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	printSubstrings(str);
}
public static void printSubstrings(String str){
int i,j;
    int n=str.length();
    for(i=0;i<n;i++)
    {
    	for(j=i;j<n;j++)
    		System.out.println(str.substring(i,j+1));
    }
}
}
