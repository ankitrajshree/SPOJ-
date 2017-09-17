import java.util.Scanner;


public class PRIME1 {
	public static void main ( String args[] ){
		int testCases = 0 , min,max,i;
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter no of testcase");
		testCases =in.nextInt();
		for ( i= 0 ; i < testCases ;i++){
			min= in.nextInt();
			//System.out.println("Min"+min);
			max = in.nextInt();
			//System.out.println("Max"+max);
			getPrimes(min,max);
			System.out.println();
		}
	}
	public static void getPrimes( int a, int b){
		int j, k ;
		boolean primeFlag;
		for ( j = a; j <=b ;j++ ){
			if ( j == 1){
				continue;
			}
			primeFlag = true;
			for ( k=2; k<j ;k++){
				if ( j%k == 0){
					primeFlag = false;
					break;
				}
			}
			if ( primeFlag ){
				System.out.println(j);
			}
		}
	}
}
