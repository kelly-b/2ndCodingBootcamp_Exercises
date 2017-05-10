import java.util.Scanner;
public class exercise2{
	public static void main (String args[]){
		System.out.println("50 euro");
		Scanner mitsos = new Scanner (System.in);
		int penintaEura=mitsos.nextInt();
		System.out.println("50 eura: "+penintaEura);

		System.out.println("20 euro");
		int eikosaEura=mitsos.nextInt();
		System.out.println("20 eura: "+eikosaEura);

		System.out.println("10 euro");
		int dekaEura=mitsos.nextInt();
		System.out.println("10 eura: "+dekaEura);

		System.out.println("5 euro");
		int pentaEura=mitsos.nextInt();
		System.out.println("5 eura: "+pentaEura);

		System.out.println("2 euro");
		int diEura=mitsos.nextInt();
		System.out.println("2 eura: "+diEura);

		System.out.println("1 euro");
		int enaEura=mitsos.nextInt();
		System.out.println("1 eura: "+enaEura);

		int athroisma= 50*penintaEura + 20*eikosaEura + 10*dekaEura + 5*pentaEura + 2*diEura + 1*enaEura;
		System.out.println("You  have "+athroisma+" euros.");
	}
}