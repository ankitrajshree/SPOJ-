import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ADALIST {
	public static void main ( String args[] ){
		int listSize = 0 , querries = 0 , i = 0 , type =0;
		List todoList = new LinkedList();
		List output = new LinkedList();
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter no of testcase");
		listSize =in.nextInt();
		querries = in.nextInt();
		for ( i =0 ; i<listSize ; i++){
			todoList.add(in.nextInt());
		}
		for ( i= 0 ; i < querries ;i++){
			type = in.nextInt();
			if ( type == 1){
				int[] querryArray = new int[3];
				querryArray[0]=type;
				querryArray[1]=in.nextInt();
				querryArray[2]=in.nextInt();
				executeQuerry(querryArray,todoList,output);
			}else{
				int[] querryArray = new int[2];
				querryArray[0]=type;
				querryArray[1]=in.nextInt();
				executeQuerry(querryArray,todoList,output);
			}
		}
		for ( i= 0;i<output.size();i++){
			System.out.println(output.get(i));
		}
	}
	public static void executeQuerry(int arr[],List tdL,List out){
		int type = 0,position = 0,data=0;
		if (arr[0] == 1){
			position = arr[1] ;
			data = arr[2];
			tdL.add(position-1, data);
		}else if(arr[0] == 2){
			position = arr[1];
			tdL.remove(position-1);
		}else{
			position = arr[1];
			out.add(tdL.get(position-1));
		}
	}
}
