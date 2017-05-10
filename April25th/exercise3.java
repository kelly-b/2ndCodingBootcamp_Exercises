import java.util.Scanner;
public class  exercise3{
	public static void main (String [] args){

		Scanner ena = new Scanner (System.in);
		double a=ena.nextInt();
		double b=ena.nextInt();
		double c=ena.nextInt();
		double d = Math.pow(b, 2)-4*a*c;
		double x = (-b+Math.sqrt(d))/(2*a);
		double y = (-b-Math.sqrt(d))/(2*a);
		if(d>0){
			System.out.println("The solutions of the equation are: x1= "+x+" and x2= "+y+".");
		}
		else if (d==0){
			System.out.println("There is only one solution to the equation and it is: x = "+x+ ".");
		}
		else {
			System.out.println("No real-valued solutions exist.");
		}

}
}