import java.util.*;

import javax.sound.midi.Track;

public class eighteen{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice,a,b;
        boolean loop=true;
        while(loop)
        {
            System.out.println("Enter desired choice:\n1.Reactangle\n2.Circle\n3.Triangle\n4.Exit.");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter Length:");
                a=scan.nextInt();
                System.out.println("Enter Breadth:");
                b=scan.nextInt();
                rectangle r = new rectangle(a, b);
                System.out.println("Area of rectangle is "+r.area());
                break;
                case 2:
                System.out.println("Enter Radius:");
                a=scan.nextInt();
                circle c = new circle(a);
                System.out.println("Area of cricle is "+c.area());
                break;
                case 3:
                System.out.println("Enter Height:");
                a=scan.nextInt();
                System.out.println("Enter Base:");
                b=scan.nextInt();
                triangle t = new triangle(a, b);
                System.out.println("Area of triangle is "+t.area());
                break;
                case 4:
                loop=false;
                break;
            }
        }
        scan.close();
    }
}

abstract class shape
{
    abstract float area();
}

class rectangle extends shape{
    private float l,b;
    rectangle(float l,float b)
    {
        this.l=l;
        this.b=b;
    }
    float area()
    {
        return l*b;
    }
}

class circle extends shape{
    final float pi = 3.14f;
    private float radius;
    circle(float radius)
    {
        this.radius=radius;
    }
    float area()
    {
        return pi*radius*radius;
    }
}

class triangle extends shape{
    private float height,base;
    triangle(float height,float base)
    {
        this.height = height;
        this.base = base;
    }
    float area()
    {
        return 0.5f*height*base;
    }
}