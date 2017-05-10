import java.util.*;
public class Dice{
	static Random rn1 = new Random();
	static int range= 6;


	public static void roll(){
		int count=0;
		int dice1=0;
		int dice2=0;
		while (dice1!=1 || dice2!=1){
			dice1=rn1.nextInt(range) +1;
			dice2=rn1.nextInt(range) +1;
			count++;
			System.out.println(dice1+" "+dice2);
		}
		System.out.println("Number of rolls: "+count);
	}
	public static void main(String [] args){
		Dice.roll();
	}

}