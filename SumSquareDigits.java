import java.util.*;
public class SumSquareDigits {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[10];
		int s=n;
		int i=0;
		while(s!=0) {
			arr[i]=s%10;
			i++;
			s=s/10;
		}
		int sum=0;
		int c=i;
		i=0;
		while(c!=0) {
			sum=sum+square(arr[i],c);
			i++;
			c--;
		}
		System.out.println(sum);
		scan.close();
	}
	public static int square(int a,int b) {
		int square=1;
		for(int loopVar=1;loopVar<=b;loopVar++) {
			square=square*a;
		}
		return square;
	}
}
