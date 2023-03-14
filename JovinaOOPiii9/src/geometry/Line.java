package geometry;

public class Line extends Shape {
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line(){
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.selected = selected;
	}

	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	public boolean contains(int x, int y)
	{
		if((y - this.startPoint.getY() == (this.endPoint.getY() - this.startPoint.getY())/(this.endPoint.getX() - this.startPoint.getX())*(x - this.startPoint.getX()))
				&& (x >= this.startPoint.getX() && x <= this.endPoint.getX() || x <= this.startPoint.getX() && x >= this.endPoint.getX()) && (y >= this.startPoint.getY() && y <= this.endPoint.getY() || y <= this.startPoint.getY() && y >= this.endPoint.getY()))
		{
			return true;
		}
		return false;
	}
	

	public Point getStartPoint() {
		return startPoint;
	}

	@Override
	public String toString() {
		return "[startPoint = " + startPoint + " --> " + "endPoint = " + endPoint + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line temp = (Line) obj;
			if (startPoint.equals(temp.startPoint) && endPoint.equals(temp.endPoint)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void moveTo(int x, int y)
	{
		this.startPoint.setX(x);
		this.startPoint.setY(y);
	}
	@Override
	public void moveBy(int byX, int byY)
	{
		this.startPoint.setX(this.startPoint.getX()+byX);
		this.startPoint.setY(this.startPoint.getY()+byY);
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}