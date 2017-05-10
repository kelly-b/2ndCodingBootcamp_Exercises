package Interfaces;
public class Shape2 implements Agreeable{
	
	private int width;
	private int height;
	
	Shape2(){
	}
	
	Shape2(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	public int calcArea(){
		int area=this.width*this.height;
		return area;
	}
	
	public boolean isSmallerThan(Agreeable other){
		int area2=((Shape2)other).calcArea();
		if(this.calcArea()<area2){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		
		}
	}
	
	public static void main(String [] args){
		Shape2 rectangle = new Shape2(2,3);
		Shape2 square = new Shape2(2,2);
		rectangle.isSmallerThan(square);
	}
}