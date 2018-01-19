import java.util.*;
public class HolidayOrNot {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next().toLowerCase();
		if(s=="sunday"||s=="saturday") {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		scan.close();
	}
}
