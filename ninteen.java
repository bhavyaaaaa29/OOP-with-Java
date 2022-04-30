/*public class ninteen {
    public static void main(String[] args) {
            X x = new X();
            Y y = new Y();      
            Z z = new Z();      
            System.out.println("Implicit Typecasting:");
            X xy = new Y();  // compiles ok (up the hierarchy)
            X xz = new Z();  // compiles ok (up the hierarchy) 
    
    //		Y y1 = new X();   X is not a Y
    //		Z z1 = new X();   X is not a Z
                    
            X x1 =  y;       // compiles ok (y is subclass of X)
            X x2 =  z;       // compiles ok (z is subclass of X)
            System.out.println("Explicit Typecasting:");
            Y y1 = (Y) x;    // compiles ok but produces runtime error
            Z z1 = (Z) x;    // compiles ok but produces runtime error
            Y y2 = (Y) x1;   // compiles and runs ok (x1 is type Y)
            Z z2 = (Z) x2;   // compiles and runs ok (x2 is type Z)
    }
}
class X{
    X()
    {
        System.out.println("X has been called.");
    }
}

class Y extends X{
    Y()
    {
        System.out.println("Y has been called.");
    }
}
class Z extends X{
    Z()
    {
        System.out.println("Z has been called.");
    }
}*/
import java.util.*;
class A {
 int x = 10;
}
class B extends A {
 int x = 2;
 void display() {
 // super.x prints value of variable x of class A
 System.out.println("X of A :" + super.x);
 // x prints value of variable x of class B
 System.out.println("X of B :" + x);
 }
}

public class ninteen {
 public static void main(String[] args) {
 B obj = new B();
 obj.display();
 }
}