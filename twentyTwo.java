import java.util.*;

public class twentyTwo {
    public static void main(String[] args) {
        Result s1 = new Result();
        boolean m1;
        String res;
        m1 = s1.pass(57);
        res = s1.division(90.5f);
        if(m1)
        System.out.println("Student passed with "+res+" class.");
        else
        System.out.println("Student has not passed.");
    }

    
}
interface exam
{
    boolean pass(int marks);
}
interface classify
{
    String division(float avg);
}
class Result implements exam,classify
{
    public boolean pass(int marks)
    {
        if(marks>=50)
        return true;
        return false;
    }
    public String division(float avg)
    {
        if(avg>60)
        return "First";
        else if(avg>50)
        return "Second";
        return "No Division";
    }
}