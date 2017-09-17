import java.util.Scanner;


public class ACPC10A {
	public static void main ( String args[] ){
		int a =0 ,b=0 ,c=0;
		Scanner in = new Scanner(System.in);
		while ( true ){
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			if ( a == 0 && b == 0 && c == 0){
				break;
			}
			getProgression(a,b,c);
		}
		in.close();
	}
	public static void getProgression( int first , int second ,int third ){
		if ( (second - first) == (third - second)){
			System.out.println("AP "+(third+(second-first)));
		}else{
			System.out.println("GP "+(third*(second/first)));
		}
	}
}
