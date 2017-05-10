import java.util.Scanner;
public class exercise6{
	public static void main (String [] args){
		System.out.print("Enter Tax Identification Number: ");
		Scanner taxID = new Scanner (System.in);
		String IDNumber = taxID.nextLine();
		char[] ch1 = IDNumber.toCharArray();
		int[] tin = new int[ch1.length];
		for (int n=0; n<ch1.length; n++)
		{
		    tin[n] = (int) ch1[n]-48 ;
		}
		//System.out.println(tin[8]);
		int sum = 0;
		int remainder1 = 0;
		int remainder2 = 0;
		for  (int i=0; i<tin.length-1; i++){
			int powers = (int)(Math.pow(2, i+1))*(tin[tin.length-2-i]);
			sum = sum + powers;
		}
			remainder1 = sum%11;
			remainder2 = remainder1%10;
			System.out.println(remainder1);
			System.out.println(remainder2);
			System.out.println(sum);

			if (remainder2==tin[tin.length-1]){
				System.out.print("Tax Identification Number valid.");
			}
			else{
				System.out.print("Tax Identification Number not valid.");
			}

	}
}
