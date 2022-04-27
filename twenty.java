public class twenty {
    public static void main(String[] args) {
        a A = new a();
        A.x=15;
        b B = new b();
        B.x=20;
        B.display();
    }
}
class a
{
    static int x;
}
class b extends a
{
    int x;
    void display()
    {
        System.out.println("Static x:"+super.x);
        System.out.println("Normal x:"+this.x);
    }
}