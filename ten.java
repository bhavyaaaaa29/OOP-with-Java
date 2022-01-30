public class ten{
    public static void main(String[] args) {
        int i=0,j=0,len = 6;
        int[][] m= new int[len][len];
        for(i=0;i<len;i++)
        {
            for(j=0;j<len;j++)
            {
                m[i][j]=(int)(Math.random()*2);
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        }
        boolean result = false;
        result = isodd(m);
        System.out.print(result?"All the rows and columns of the matrix has odd number of ones.":"All the rows and columns of the matrix does not have odd number of ones.");
    }
    public static boolean isodd(int[][] mat)
    {
        int row = 0,col = 0,i,j;
        boolean ans = true;
        for(i=0;i<6;i++)
        {
            for(j=0;j<6;j++)
            {
                if(mat[i][j]==1)
                    row++;
            }
            if(row%2==0)
            {
                ans = false;
                break;
            }
            row = 0;
        }
        for(i=0;i<6;i++)
        {
            for(j=0;j<6;j++)
            {
                if(mat[j][i]==1)
                col++;
            }
            if(col%2==0)
            {
                ans = false;
                break;
            }
            col = 0;
        }
        return ans;
    }
}