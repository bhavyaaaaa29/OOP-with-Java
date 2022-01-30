import java.util.Random;
import java.util.*;
public class eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c;
        System.out.print("1.Random number generator between 0 to 49.\n2.Dice Game.\nEnter your choice:");
        c = scan.nextInt();
        Random r = new Random(1000);
        Random r1 = new Random();
        switch(c)
        {
            case 1:
            for(int i=0;i<100;i++)
            {
                System.out.print(r.nextInt(50)+" ");
                if((i+1)%10==0)
                 System.out.print("\n");
            }
            break;
            case 2:
            System.out.print("Enter name of first player:");
            String name1 = scan.next();
            scan.nextLine();
            System.out.print("Enter name of second player:");
            String name2 = scan.next();
            int p1=0,p2=0;
            for(int i=0;p1<=30||p2<=30;i++)
            {
                if(i%2==0){
                    p1+=r1.nextInt(7);
                    if(p1>=30)
                    {
                        System.out.println(name1+" wins.");
                        break;
                    }
                }
                else{
                    p2+=r1.nextInt(7);
                    if(p2>=30)
                    {
                        System.out.println(name2+" wins.");
                        break;
                    }
                }
            }
        }
        scan.close();
    }
}
