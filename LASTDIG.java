import java.util.Scanner;


public class LASTDIG {
	public static void main ( String args[] ){
		int testCases = 0  , a =0 ,i=0, tmp =1;
		long b = 0L;
		Scanner in = new Scanner(System.in);
		testCases = in.nextInt();
		for ( i =0;i<testCases ;i++){
			tmp =1;
			a = in.nextInt();
			b = in.nextLong();
			for ( long j=0L;j<b;j++){
				tmp = tmp * a;
				tmp = tmp%10;
			}
			System.out.println(tmp);
		}
		in.close();
	}
}
