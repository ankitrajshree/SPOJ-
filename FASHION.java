import java.util.Scanner;
public class FASHION{
	
public static void main ( String args[] ){
		int testCases = 0  , pairs =0 , i=0 ,j=0;
		Scanner in = new Scanner(System.in);
		testCases = in.nextInt();
		for ( i =0;i<testCases ;i++){
			pairs = in.nextInt();
			int[] males= new int[pairs];
			int[] females= new int[pairs];
			for ( j =0 ; j < pairs ;j++){
				males[j] = in.nextInt();
			}
			for ( j =0 ; j < pairs ;j++){
				females[j] = in.nextInt();
			}
			sortArray(males);
			sortArray(females);
			int result = getHotness(males,females);
			System.out.println(result);
		}
		in.close();
	}

	public static void sortArray ( int arr[]){
		int i=0;
		int l= arr.length;
		int[] count = new int[10];
		int[] out = new int[l];
		for ( i =0 ;i<l;i++){
			count[arr[i]]++;
		}
		for( i=1;i<10;i++){
			count[i] += count[i-1]; 
		}
		for( i=0 ; i<l ;i++){
			out[count[arr[i]]-1]=arr[i];
			count[arr[i]]= count[arr[i]]-1;
		}
		for (i=0;i<l;i++){
			arr[i]=out[i];
		}
	}
	
	public static int getHotness(int m[] ,int f[]){
		int sum = 0, i = 0 ;
		for ( i = 0;i<m.length;i++){
			sum = sum + (m[i]*f[i]);
		}
		return sum;
	}
}