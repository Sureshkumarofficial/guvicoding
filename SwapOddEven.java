package data;
import java.util.*;
public class SwapOddEven {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String temp;
		String []charSplit=s.split("");
		for(int loopVar=0;loopVar<charSplit.length;loopVar=loopVar+2) {
			temp=charSplit[loopVar];
			charSplit[loopVar]=charSplit[loopVar+1];
			charSplit[loopVar+1]=temp;
		}
		for(int loopVar=0;loopVar<charSplit.length;loopVar++) {
			System.out.print(charSplit[loopVar]);
		}
		scan.close();
	}
}
