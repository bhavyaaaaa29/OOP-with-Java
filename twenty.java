public class twenty {
    public static void main(String[] args) {
        b obj = new b();
        obj.display();
    }
}
class a
{
    static int x=10;
}
class b extends a
{
    int x=15;
    public void display()
    {
        System.out.println("Static x:"+a.x);
        System.out.println("Normal x:"+x);
    }
}