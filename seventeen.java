public class seventeen {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.m1();
        b.m1();
    }
}
class A
{
    void m1()
    {
        System.out.println("Method 1 invoked from class A.");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("Method 1 overridden and invoked from class B.");
    }
}