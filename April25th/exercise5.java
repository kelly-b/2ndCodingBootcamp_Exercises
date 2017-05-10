import java.util.Scanner;
public class exercise5{
	public static void main(String [] args){
		System.out.print("Enter number of pronic numbers: ");
		Scanner nOfPronics = new Scanner (System.in);
		int numbers=nOfPronics.nextInt();
		for (int n=1; n<=numbers;n++){
			int pronicProduct = n*(n+1);
			System.out.print(pronicProduct+" ");
		}
	}
}