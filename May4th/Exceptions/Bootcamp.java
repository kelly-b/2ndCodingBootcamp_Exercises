package Exceptions;

import java.io.*;

public class Bootcamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void welcome (double number)throws DigitException, AnotherDigitException{
		if(number>25){
			throw new DigitException();
		}
		else{
			throw new AnotherDigitException();
		}		
	}
	
	public static int bye(){
		int prwto=230;
		try{
			welcome(299.7);
		}catch (AnotherDigitException a){
			return prwto;
		}catch (DigitException d){
			return 605;
		}
		return 1;
	}
}
