import java.util.*;
public class PrimeRange {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int s=0,count=0;
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		 while(n1<=n2)
		    {
		        for(int loopVar=2;loopVar<=n1/2;loopVar++)
		        {
		            s=0;
		            if(n1%loopVar==0)
		            {
		                s=1;
		                break;
		            }
		        }
		        if(s==0)
		            count+=1;
		        n1++;
		    }
		 System.out.println(count);
		 scan.close();
	}
}
