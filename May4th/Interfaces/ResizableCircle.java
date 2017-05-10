package Interfaces;
public class ResizableCircle extends Circle implements Resizable{
	
	
	ResizableCircle(int r){
		super(r);
	}
	
	public void resize(double percentage){
		super.radius=(double)percentage*radius;
	}

	public static void main(String [] args){
		ResizableCircle c1=new ResizableCircle(3);
		c1.resize(0.5);
		c1.getArea();
	}
}