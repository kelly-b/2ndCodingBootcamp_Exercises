public class Circle{
	private int x;
	private int y;
	private int radius;
	private static final double pi=3.14;
	private static int numberOfCreatedCircles;

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getRadius(){
		return radius;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setRadius(int r){
		this.radius=r;
	}
	Circle(){
		this.x=this.y=0;
		this.radius=5;
		numberOfCreatedCircles++;
	}
	Circle(int x, int y, int r){
		this.x=x;
		this.y=y;
		this.radius=r;
		numberOfCreatedCircles++;
	}
	Circle(int x, int y){
		this();
		this.x=x;
		this.y=y;
		numberOfCreatedCircles++;
	}
	public void printCircleDetails(){
		System.out.println("* I'm a circle at point ("+this.x+","+this.y+") with radius "+this.radius);
	}
	public double calculateArea(){
		double area=pi*this.radius*this.radius;
		System.out.println("The circle's area is: "+area);
		return area;
	}
	public double calculatePerimeter(){
		double perimeter=2*pi*this.radius;
		System.out.println("The circle's perimeter is: "+perimeter);
		return perimeter;
	}
	public Circle(Circle cyclos){
		this(cyclos.x, cyclos.y, cyclos.radius);
		numberOfCreatedCircles++;
	}
	public boolean cocentric(Circle c1){
		if (this.getX()==c1.getX() && this.getY()==c1.getY()){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
	}
	public static void amount(){
		System.out.println(numberOfCreatedCircles);
	}
}