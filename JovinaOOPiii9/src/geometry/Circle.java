package geometry;

public class Circle extends Shape{
	
	private Point center;
	private int r;
	private boolean selected;
	
	public Circle() {

	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	public Circle(Point center, int r, boolean selected) {
		this(center, r);
		this.selected = selected;
	}
	
	public double circumference() {
		return 2 * r * Math.PI;
	}
	
	public double area() {
		return r * r * Math.PI;
	}
	public boolean contains(int x, int y)
	{
		if(this.r >= this.center.distance(x, y))
			{
				return true;
			}
		return false;
	}
	
	
	
	

	@Override
	public String toString() {
		return "[center = " + center + ", r = " + r + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle temp = (Circle) obj;
			if (center.equals(temp.center) && r == temp.r) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void moveTo(int x, int y)
	{
		this.center.setX(x);
		this.center.setY(y);
	}
	@Override
	public void moveBy(int byX, int byY)
	{
		this.center.setX(this.center.getX() + byX);
		this.center.setY(this.center.getY() + byY);
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
