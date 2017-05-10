public class exercise1{
	public static void main (String [] args){
		int a[]= new int[9];
		for  (int x=1; x<=a.length; x++){
			a[a.length-x]=x;

			for (int y=0; y<x ; y++){
				a[a.length-y-1]=x;
			}
			for(int i=0; i<a.length; i++){
				System.out.print(a[i]);

			}
			System.out.println(" ");
		}
	}
}