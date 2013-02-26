public class Vector
{
    public long x, y, z;
    
    public Vector(long a, long b, long c)
    {
        x = a;
        y = b;
        z = c;
    }
    
    public Vector()
    {
        this(0, 0, 0);
    }

    public Vector add(Vector v)
    {
        Vector result = new Vector();
        result.x = this.x + v.x;
        result.y = this.y + v.y;
        result.z = this.z + v.z;
        return result;
    }

    public Vector sub(Vector v)
    {
        Vector result = new Vector();
        result.x = this.x - v.x;
        result.y = this.y - v.y;
        result.z = this.z - v.z;
        return result;
    }

    public long dot(Vector v)
    {
        long result = this.x * v.x;
        result += this.y * v.y;
        result += this.z * v.z;
        return result;
    }

    public Vector cross(Vector v)
    {
        long temp1, temp2, temp3;
        temp1 = this.y * v.z - v.y * this.z;
        temp2 = -(this.x * v.z) + v.x * this.z;
        temp3 = this.x * v.y - v.x * this.y;
        return new Vector(temp1, temp2, temp3);
    }
}