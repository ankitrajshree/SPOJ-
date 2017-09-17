import java.util.Scanner;


public class SAMER08F {
	public static void main ( String args[] ){
		int num =0;
		Scanner in = new Scanner(System.in);
		while ( true ){
			num = in.nextInt();
			if ( num == 0 ){
				break;
			}
			getSquares(num);
		}
		in.close();
	}
	public static void getSquares( int n ){
		int sum = n*n;
		if ( n == 1){
			System.out.println(n);
			return;
		}
		for (int i = n-1 ; i>=2 ;i--){
			sum = sum + (i*i);
		}
		System.out.println(sum+1);
	}
}
