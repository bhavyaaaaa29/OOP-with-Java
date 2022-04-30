public class twenty {
    public static void main(String[] args) {
        b B = new b();
        B.x=20;
        B.display();
    }
}
class a
{
    static int x=10;
}
class b extends a
{
    int x=15;
    void display()
    {
        System.out.println("Static x:"+x);
        System.out.println("Normal x:"+this.x);
    }
}