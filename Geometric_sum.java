package Programs2;
import java.util.*;
public class Geometric_sum {
public static void main(String[] args) {
	System.out.print("Enter the value of common ratio : ");
	Scanner s=new Scanner(System.in);
	int cr=s.nextInt();
	System.out.println("Geometric sum for "+ cr +" as common ratio is : "+findGeometricSum(cr));
}
public static double findGeometricSum(int k){
if(k==0)
		return 1;
	return ((1/Math.pow(2,k))+findGeometricSum(k-1));
}
}
