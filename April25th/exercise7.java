import java.util.Scanner;
public class exercise7{
	public static void main (String [] args){
		System.out.print("Enter Binary Number: ");
		Scanner bins = new Scanner (System.in);
		String posaBins = bins.nextLine();
		char[] ch1 = posaBins.toCharArray();
		int[] binNumber = new int[ch1.length];
		for (int n=0; n<ch1.length; n++)
		{
		    binNumber[n] = (int) ch1[n]-48 ;
		}
		//System.out.println(posaBins);
		int count=0;
		for (int i=0; i<binNumber.length-1; i++){
			if (binNumber[i]==1){
				count++;
			}
		}
		System.out.print(count);
		if((count%2)==0 ){
			if(binNumber[7]==0){
			System.out.println("Parity check OK.");
			}
			else {
			System.out.println("Parity check not OK.");
		    }
	}
		else {
			if(binNumber[7]==1){
					System.out.println("Parity check OK.");
				}
			else {
					System.out.println("Parity check not OK.");
				}

		}
	}
}