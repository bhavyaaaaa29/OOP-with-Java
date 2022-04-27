

public class twentyThree {
    public static void main(String[] args) {
        new circle().findArea();
    }
}
final class circle
{
    final float radius=10f;
    final float pi=3.14f;
    final void findArea()
    {
        System.out.println("Area of the circle is "+(pi*radius*radius));
    }
}