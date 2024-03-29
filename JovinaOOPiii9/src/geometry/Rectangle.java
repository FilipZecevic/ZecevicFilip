package geometry;

public class Rectangle extends Shape{
	

	public Point upperLeft;
	public int width;
	public int height;
	public boolean selected;
	
	public Rectangle() {

	}

	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height);
		this.selected = selected;
	}
	
	public int circumference() {
		return 2*(width+height);
	}
	
	public int area() {
		return width * height;
	}
	public boolean contains(int x, int y)
	{
		if(x >= this.upperLeft.getX() && x <= (this.upperLeft.getX() + this.width) && y <= this.upperLeft.getY() && y >= (this.upperLeft.getY() - this.height))
			{
				return true;
			}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "[upperLeft = " + upperLeft + ", width = " + width + ", height = " + height + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle temp = (Rectangle) obj;
			if (upperLeft.equals(temp.upperLeft) && width == temp.width && height == temp.height) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void moveTo(int x, int y)
	{
		this.upperLeft.setX(x);
		this.upperLeft.setY(y);
	}
	@Override
	public void moveBy(int byX, int byY)
	{
		this.upperLeft.setX(this.upperLeft.getX() + byX);
		this.upperLeft.setY(this.upperLeft.getY() + byY);
	}
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
