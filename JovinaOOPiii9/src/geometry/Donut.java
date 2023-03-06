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
    public boolean contains(int x, int y)
	{
		System.out.println("uradi za domaci");
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
