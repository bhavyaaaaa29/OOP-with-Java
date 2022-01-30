import java.util.*;
class student{
    private long enroll;
    private String name;
    private String gender;
    public student()
    {
        enroll = 0;
        name = "NULL";
        gender = "Undefined";
    }
    public student(long en,String n,String gen)
    {
        setenroll(en);
        setName(n);
        setGender(gen);
    }
    public void setenroll(long num)
    {
        this.enroll = num;
    }
    public void setName(String s)
    {
        this.name = s;
    }
    public void setGender(String g)
    {
        this.gender = g;
    }
    public long getenroll()
    {
        return enroll;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    

}
public class twelve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter enrollment number ofstudent:");
        long rollno = scan.nextLong();
        System.out.print("Enter name of student:");
        scan.nextLine();
        String name = scan.nextLine();
        //scan.nextLine();
        System.out.print("Enter gender of student:");
        String gender = scan.nextLine();
        scan.close();
        student s = new student(rollno,name,gender);
        System.out.println("\nName of Student:"+s.getName());
        System.out.println("Enrollment number of Student:"+s.getenroll());
        System.out.println("Gender of Student:"+s.getGender());
    }
}
