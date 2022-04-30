class twenty
{
    public static void main(String arg[])
    {
        B b=new B(56,44);
        b.display();
    }
}
class A
{
    public static int x;
}
class B extends A
{
    public int x;
    B(int a,int b)
    {
        A.x=a;
        this.x=b;
    }
    void display()
    {
        System.out.println("Static variable x: "+A.x);
        System.out.println("Normal variable x: "+this.x);
    }
    
}