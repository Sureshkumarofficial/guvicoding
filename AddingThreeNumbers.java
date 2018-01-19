import java.util.*;
public class AddingThreeNumbers {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char []arr=s.toCharArray();
		for(int loopVar=0;loopVar<s.length();loopVar++) {
			if(arr[loopVar]=='x')
				System.out.print('a');
			else if(arr[loopVar]=='y')
				System.out.print('b');
			else if(arr[loopVar]=='z')
				System.out.print('c');
			else if(arr[loopVar]=='Y')
				System.out.print('B');
			else if(arr[loopVar]=='X')
				System.out.print('A');
			else if(arr[loopVar]=='Z')
				System.out.print('C');
			else
				System.out.print((char)(arr[loopVar]+3));
		}
		scan.close();
	}
}
