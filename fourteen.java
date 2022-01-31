public class fourteen {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle(10);
        circle c3 = new circle();
        circle c4 = new circle(1.25f);
        c2.getNum();
    }
}
class circle{
    private float radius;
    static int count= 0;
    public circle()
    {
        count++;
    }
    public circle(float r)
    {
        //this();
        setRadius(r);
    }
    public void setRadius(float r)
    {
        this.radius = r;
    }
    public float getRadius()
    {
        return radius;
    }
    public void getNum()
    {
        System.out.println("The default constructor is called "+count+" times.");
    }
}
