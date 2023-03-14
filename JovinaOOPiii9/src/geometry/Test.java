package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Point p = new Point(5,6);
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
		System.out.println(r.equals(r1));*/
		
		Point p1 = new Point(5,6);
		Point p2 = new Point(10,6);
		System.out.println(p1.contains(5, 6));
		System.out.println(p2.contains(5, 6));
		System.out.println();
		
		Line l = new Line(p1, p2);
		System.out.println(l.contains(7, 6));
		System.out.println(l.contains(11, 6));
		System.out.println();
		
		Rectangle r = new Rectangle(p1, 5, 6);
		System.out.println(r.contains(5, 6));
		System.out.println(r.contains(4, 6));
		System.out.println();
		
		Circle c = new Circle(p1, 5);
		System.out.println(c.contains(5, 6));
		System.out.println(c.contains(5, 12));
		System.out.println();
		
		Donut d = new Donut(p1, 5, 3);
		System.out.println(d.contains(5, 6));
		System.out.println(d.contains(5, 10));
		
		
	}

}
