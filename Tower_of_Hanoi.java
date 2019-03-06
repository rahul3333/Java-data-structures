package Programs2;
import java.util.*;
public class Tower_of_Hanoi {
public static void main(String[] args) {
	char a='a',b='b',c='c';
	System.out.print("How many disks do you want : ");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	towerOfHanoi(n, a, b, c);
}
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==0)
			return;
			towerOfHanoi(disks-1,source,destination,auxiliary);
			System.out.println(source+" "+destination);
			towerOfHanoi(disks-1,auxiliary,source,destination);
    }
}
