import java.io.*;

class twentySix
{
    public static void main(String args[])
    {
        try
        {
        FileReader f1 = new FileReader("OOP-with-Java\\src.txt");
        BufferedReader br = new BufferedReader(f1);
        FileWriter f2 = new FileWriter("OOP-with-Java\\dest.txt");
        String word1,word2;
        BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter word 1:");
        word1 = b2.readLine();
        System.out.println("Enter word 2:");
        word2 = b2.readLine();
        String x="",msg="";
        while((x=br.readLine())!=null)
        {

            msg+=x+" ";
        }
        f1.close();
        msg = msg.replace(word1,word2);
        f2.write(msg);
        f2.close();
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
    }
}
/*one
Scanner sc = new Scanner(System.in); // creates instance of Scanner to read from console
        String str = sc.nextLine(); 
        int num = sc.nextInt(); // read integer
        boolean bl = sc.nextBoolean(); // read boolean
        
        System.out.println("integer = " + num + " boolean = " + bl + " string = " + "'" + str + "'");
        sc.close(); // close scanner
*/

/*two
File f = new File("OOP-with-Java\\fun.txt");
    if (f.exists())
        System.out.println("The file specified Exists");
    else
        System.out.println("Does not Exists");
*/

/*Three
File file = new File("JavaFile.java");

          boolean value;
        try {
            value = file.createNewFile();
            if (value) {
                System.out.println("New Java File is created.");
              }
              else {
                System.out.println("The file already exists.");
              }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/