import java.util.Random;
import java.util.*;
public class eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c;
        System.out.print("1.Random number generator between 0 to 49.\n2.Dice Game.\nEnter your choice:");
        c = scan.nextInt();
        scan.close();
        switch(c)
        {
            case 1:
            Random r = new Random(1000);
            for(int i=0;i<100;i++)
            {
                System.out.print(r.nextInt(50)+" ");
                if((i+1)%10==0)
                 System.out.print("\n");
            }
            break;
        }
    }
}
