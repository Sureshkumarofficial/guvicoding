import java.util.*;
public class BiggestNumber {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		int temp;
		for(int loopVar=0;loopVar<n;loopVar++) {
			arr[loopVar]=scan.nextInt();
		}
		for(int loopVar=0;loopVar<n;loopVar++) {
			for(int loopVar1=loopVar+1;loopVar1<n;loopVar1++) {
				if(arr[loopVar]<arr[loopVar1]) {
					temp=arr[loopVar];
					arr[loopVar]=arr[loopVar1];
					arr[loopVar1]=temp;
				}
			}
		}
		for(int loopVar=0;loopVar<n;loopVar++) {
			System.out.print(arr[loopVar]);
		}
		scan.close();
	}

}
