public class F1_Race
{
    public static void main(String[] args)
    {
       int n = 4;
       int mat[][] = {{1,3},{2,5},{2,4},{3,5}};
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
           if(min > mat[i][0])
               min = mat[i][0];   
           if(max < mat[i][1])
               max = mat[i][1];
       }
       int ans = 0;
       for(int i=min;i<=max;i++)
       {         
           int check = 0;
           for(int j=0;j<n;j++)
           {
              if(mat[j][0] < i && mat[j][1] >= i)
	              check++;
           }
          if(check > ans)
        	  ans=check;
       }
       System.out.println("\nMaximum number of cars that can serivce on just one pit : "+ans);
    }
}