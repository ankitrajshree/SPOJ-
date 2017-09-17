import java.math.BigInteger;
import java.util.Scanner;


public class FCTRL2 {
	public static void main ( String args[] ){
		int testCases = 0  , num =0;
		Scanner in = new Scanner(System.in);
		testCases = in.nextInt();
		for ( int i =0;i<testCases ;i++){
			num = in.nextInt();
			getFactorial(num);
		}
	}
	
	public static void getFactorial( int num ){
		BigInteger fact = new BigInteger("1.000");
		for ( long i=1;i<=num;i++) {
			BigInteger bI2 = BigInteger.valueOf(i);
			fact = fact.multiply();
		}
		System.out.println(fact);
	}
}
