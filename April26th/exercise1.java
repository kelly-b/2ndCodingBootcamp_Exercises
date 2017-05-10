public class exercise1{

	public static void main(String [] args){
		//exercise1 a = new exercise1();
		//exercise1 b = new exercise1();
		int a=exercise1.bootCamp(25, 91);
		int b=exercise1.bootCamp(91, 25);
		System.out.println("First: "+a);
		System.out.println("Second: "+b);
	}
	public static int bootCamp(int number1, int number2){
		if (number1<number2){
			return (int)Math.sqrt(Math.abs(number1-number2));
		}
		else{
			return number1+number2;
		}

}
}