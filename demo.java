public class demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.Display();
    }
}
class A
{
    int x = 65;
}
class B extends A{
    int x = 66;
    public void Display()
    {
        System.out.println("The value of x in class A:"+super.x);
        System.out.println("The value of x in class B:"+x);
    }
}