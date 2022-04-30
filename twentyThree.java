

public class twentyThree {
    public static void main(String[] args) {
        new c().findArea();
    }
}
final class c
{
    final float radius=10f;
    final float pi=3.14f;
    final void findArea()
    {
        System.out.println("Area of the circle is "+(pi*radius*radius));
    }
}