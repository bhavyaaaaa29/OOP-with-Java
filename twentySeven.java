import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
class cir
{
    int radius;
    cir(int r)
    {
        radius = r;
    }
    float area=3.14f*radius*radius;

}
class streamoutput{
    public static void addData(cir c1)
    {
        try {
			FileOutputStream fos = new FileOutputStream("OOP-with-Java\\circle.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// write object to file
			oos.writeObject(c1);
			System.out.println("Done");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
public class twentySeven {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n;
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter radius:");
            n=scan.nextInt();
            cir c = new cir(n);
            streamoutput.addData(c);
        }	
	}

}
