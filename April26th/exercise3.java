import java.util.*;
public class exercise3{
	public static int [] firstArray=new int[]{1,2,3,4,5,6,7,8,9,10};
	public static void printArray(){
	System.out.print("[");
	for (int n=0; n<firstArray.length; n++){
		System.out.print(firstArray[n]+" ");
	}
	System.out.println("]");
}
	public static void shift(){
		System.out.println("Enter number of shifts: ");
		Scanner nOfShifts = new Scanner (System.in);
		int shiftTimes=nOfShifts.nextInt();
		for(int i=0; i<shiftTimes; i++){
			int last = firstArray[firstArray.length-1];

			for(int j=firstArray.length-1; j>0; j--){
				firstArray[j]=firstArray[j-1];
			}
			firstArray[0]=last;
			printArray();
			}
	}
	public static void main(String [] args){
		exercise3.printArray();
		exercise3.shift();
	}
}