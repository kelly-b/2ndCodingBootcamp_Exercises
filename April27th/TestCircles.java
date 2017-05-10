public class TestCircles{
	public static void main(String [] args){
		Circle c = new Circle();
		c.setX(1);
		c.setY(1);
		c.setRadius(2);
		c.printCircleDetails();
		c.calculateArea();
		c.calculatePerimeter();
		Circle c1 = new Circle();
		c1.printCircleDetails();
		c1.calculateArea();
		c1.calculatePerimeter();
		Circle c2 = new Circle(2,3,4);
		c2.printCircleDetails();
		c2.calculateArea();
		c2.calculatePerimeter();
		Circle c3 = new Circle(2,3);
		c3.printCircleDetails();
		c3.calculateArea();
		c3.calculatePerimeter();
		Circle cyclos1=new Circle(4,4,4);
		Circle copyOfCyclos1=new Circle(cyclos1);
		cyclos1.printCircleDetails();
		copyOfCyclos1.printCircleDetails();
		cyclos1.setX(5);
		cyclos1.setY(5);
		cyclos1.setRadius(5);
		cyclos1.printCircleDetails();
		copyOfCyclos1.printCircleDetails();
		c2.cocentric(c3);
		c1.cocentric(c2);
		c1.amount();


	}
}