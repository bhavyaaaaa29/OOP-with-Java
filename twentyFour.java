

public class twentyFour {
    public static void main(String[] args) {
        int a[]=new int[5];
        try{        
            a[5]=30/0;     
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
              try
              {
                System.out.println(a[10]);  
              }
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              } 
              try
             {
                classA();
             }
             catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }       
              finally
              {
                  System.out.println("Inside finally block.");
              }      
           System.out.println("rest of the code");    
    }  
    public static void classA() throws ArrayIndexOutOfBoundsException
    {
        throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
    }
        
}

