package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(5,6);
		Point p1 = new Point(5,6);
		System.out.println(p.toString());
		
		Line l = new Line(new Point(5,6), new Point(8,9));
		Line l1 = new Line(new Point(5,6), new Point(8,9));
		System.out.println(l.toString());
		
		Circle c = new Circle(p, 5);
		Circle c1 = new Circle(p, 5);
		System.out.println(c.toString());
		
		Rectangle r = new Rectangle(p, 3, 2);
		Rectangle r1 = new Rectangle(p, 3, 2);
		System.out.println(r.toString());
		
		System.out.println("");
		
		System.out.println(p.equals(p1));
		System.out.println(l.equals(l1));
		System.out.println(c.equals(c1));
		System.out.println(r.equals(r1));
	}

}
