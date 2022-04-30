public class sixteen {
    public static void main(String[] args) {
        b B = new b(10);
    }
}
class a
{
    int x;
    a(int x)
    {
        System.out.println("Constructor form parent class is invoked.");
        this.x=x;
        System.out.println("Value of parameter is:"+x);
    }
}
class b extends a{
    b(int y)
    {
        super(y);
    }
}