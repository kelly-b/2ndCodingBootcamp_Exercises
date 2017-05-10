import java.util.Scanner;
public class TestInsurance{
	public static void main(String [] args){
		//Create random cutomers
		Customer ruth = new Customer("Ruth",1985,"female");
		Customer john = new Customer("John",1973,"male");

		//Create random insurances for the above customers
		//Insurance first = new Insurance(15, ruth);
		//Insurance second = new Insurance(23, john);

		//Create a random life insurance
		Life life1 = new Life(15, ruth, 500);

		//Create a random health insurance
		Health health1 = new Health(23, john, 800);
		
		boolean kelly=true;

		while(kelly){
			System.out.println("***** Menu *****");
			System.out.println("1. Print all Insurances");
			System.out.println("2. Search insurances by customer code");
			System.out.println("3. Search insurances by insurance code");
			Scanner userInput = new Scanner (System.in);
			Integer input = userInput.nextInt();


			switch(input){
				case 1:
					Insurance.printInsurances();
					break;
				case 2:
					System.out.println("Please insert customer code.");
					input = userInput.nextInt();
					Insurance.printSpecificInsuranceByCustomer(input);
					break;
				case 3:
					System.out.println("Please insert insurance code.");
					input = userInput.nextInt();
					Insurance.printSpecificInsurance(input);
					break;
				case 0:
					kelly=false;
					break;
		}
		}
	}
}