package geometry;

public class Donut extends Circle{
    private int innerR;


    public Donut()
    {

    }
    public Donut(int innerR)
    {
        this.innerR = innerR;
    }
    public Donut(Point center, int r, int innerR)
    {
        super(center, r);
        this.innerR = innerR;
    }
    public Donut(Point center, int r, boolean selected, int innerR)
    {
        super(center, r, selected);
        this.innerR = innerR;
    }
    

    @Override
    public double area()
    {
        return super.area()- innerR*innerR*Math.PI;
    }
    @Override
    public double circumference()
    {
        return super.circumference() + innerR * 2 * Math.PI;
    }
    @Override
    public boolean contains(int x, int y)
    {
    	if(super.getR() >= super.getCenter().distance(x, y) && this.innerR <= super.getCenter().distance(x, y))
    	{
    		return true;
    	}
    	
    	return false;
    }
    @Override
    public void moveTo(int x, int y)
    {
    	super.getCenter().setX(x);
    	super.getCenter().setY(y);
    }
    @Override
    public void moveBy(int byX, int byY)
    {
    	super.getCenter().setX(super.getCenter().getX() + byX);
    	super.getCenter().setY(super.getCenter().getY() + byY);
    }
    @Override
    public String toString()
    {
        return super.toString() + "innerR: " + innerR;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Donut)
        {
            Donut temp = (Donut) obj;
            if (super.equals(temp) && innerR == temp.innerR)
            {
                return true;
            }
        }
        return false;
    }
    
    
    public int getInnerR()
    {
        return innerR;
    }
    public void setInnerR(int innerR)
    {
        this.innerR = innerR;
    }
}
