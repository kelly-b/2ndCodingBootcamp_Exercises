import java.util.Scanner;
public class exercise9{
	public String toString(){
		System.out.print("Enter 9 digit number: ");
		Scanner numbers = new Scanner (System.in);
		String numberString = numbers.nextLine();
		char[] ch1 = numberString.toCharArray();
		int[] numberArray = new int[ch1.length];
		for (int n=0; n<ch1.length; n++)
		{
		    numberArray[n] = (int) ch1[n]-48 ;
		}
		//System.out.println(numberString);
		String ena = new String();
		String dyo = new String();
		String tria = new String();
		for(int i=0; i<numberArray.length; i++){
			if((numberArray[i]%3)==1){
				ena=ena+"  "+numberArray[i];
				 }
			 else if((numberArray[i]%3)==2){
				 dyo=dyo+"  "+numberArray[i];
				 }
			 else{
				 tria=tria+"  "+numberArray[i];
			 }
		}
		return ena+"\n "+dyo+"\n  "+tria;
	}
	public static void main (String [] args){
			exercise9 printEna= new exercise9();
			System.out.println(printEna.toString());

	}
}