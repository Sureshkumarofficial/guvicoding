import java.util.*;
public class RightSwiftKTimes {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int temp=0;
		int []arr=new int[n];
		for(int loopVar=0;loopVar<n;loopVar++) {
			arr[loopVar]=scan.nextInt();
		}
		for(int i=0;i<k-1;i++) {
			for(int loopVar=0;loopVar<n;loopVar++) {
				if(loopVar==(n-1)) {
					break;
				}
				else {
					temp=arr[loopVar];
					arr[loopVar]=arr[loopVar+1];
					arr[loopVar+1]=temp;
				}
			}
		}
		for(int loopVar=0;loopVar<n;loopVar++) {
			System.out.print(arr[loopVar]+" ");
		}
		scan.close();
	}
}
