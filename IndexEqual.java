import java.util.*;
public class IndexEqual {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		int []arr1=new int[n];
		for(int loopVar=0;loopVar<n;loopVar++) {
			arr[loopVar]=scan.nextInt();
		}
		int count=0;
		for(int loopVar=0;loopVar<n;loopVar++) {
			if(loopVar==arr[loopVar]) {
				arr1[count]=arr[loopVar];
				count++;
			}
		}
		for(int loopVar=0;loopVar<count;loopVar++) {
			System.out.print(arr1[loopVar]);
		}
		scan.close();
	}
}
