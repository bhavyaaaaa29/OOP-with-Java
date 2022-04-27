
import java.util.Scanner;

public class twentyThree {
    public static void main(String[] args) {
        circle c = new circle();
        c.area();
    }
}
final class circle
{
    final float radius=10f;
    final float pi=3.14f;
    public final void area()
    {
        System.out.println("Area of the circle is "+(pi*radius*radius));
    }
}