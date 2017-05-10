public class exercise4{
	public static void main( String [] args){
		float athrArmoniko =  0;
		float last = 0;
		int n = 0;
		for (n=1; n<=5; n++){
			last = (float)1/n;
			athrArmoniko += last;
			System.out.println("Harmonic Sum = "+athrArmoniko);
		}
	}
}