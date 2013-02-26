public class Point
{
    public int x = 0;
    public int y = 0;

    public Point(int a, int b)
    {
        x = a;
        y = b;
    }
    
    public Point sub(Point p)
    {
        return new Point(this.x - p.x, this.y - p.y);
    }
    
    public Point add(Point p)
    {
        return new Point(this.x + p.x, this.y + p.y);
    }
}