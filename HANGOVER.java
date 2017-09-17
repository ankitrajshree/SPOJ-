import java.util.Scanner;


public class HANGOVER {
	public static void main ( String args[] ){
		int testCases = 0 , count;
		double length = 0.00;
		Scanner in = new Scanner(System.in);
		while(true){
			length= in.nextDouble();
			if ( length == 0.00 ){
				break;
			}
			count = getCardCount(length);
			System.out.println(count+" card(s)");
		}
	}
	public static int getCardCount(double l){
		int cardCount = 0, i ;
		double sum = 0.00;
		for ( i=1 ; i< 500 ;i++){
			sum = sum + ((double)1 / (i+1));
			if ( sum > l){
				cardCount = i;
				break;
			}
		}
		return cardCount;
	}
}


