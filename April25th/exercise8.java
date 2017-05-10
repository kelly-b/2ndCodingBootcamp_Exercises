import java.util.Scanner;
public class exercise8{

	public static void main (String [] args){
		exercise8 printMonoi= new exercise8();
		//exercise8 printZygoi= new exercise8();
		System.out.println(printMonoi.toString());

	}
	public String toString(){
			System.out.print("Enter 10 digit number: ");
			Scanner numbers = new Scanner (System.in);
			String numberString = numbers.nextLine();
			char[] ch1 = numberString.toCharArray();
			int[] numberArray = new int[ch1.length];
			for (int n=0; n<ch1.length; n++)
			{
			    numberArray[n] = (int) ch1[n]-48 ;
			}
			String monoi = new String();
			String zygoi = new String();
			for(int i=0; i<numberArray.length; i++){
				if((numberArray[i]%2)!=0)
				{
					monoi=monoi+" "+numberArray[i];
				}
				else{
					zygoi=zygoi+" "+numberArray[i];
				}
			}

				return monoi+"\n "+zygoi;
	}
}
