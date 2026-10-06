package Two_d_array;

public class identity_matrix{

   public static void main(String[] args) {
     
       int [][] arr=new int[2][2];
       
       arr[0][0]=1;
       arr[0][1]=0;
       arr[1][0]=0;
       arr[1][1]=1;
       
       boolean zero_check=true;
       
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               if(i==j)
               {
                   if(arr[i][j]!=1)
                   {
                	   zero_check=false;
                       break;
                   }
               }
               else
               {
                   if(arr[i][j] !=0)
                   {
                       zero_check=false;
                       break;
                   }
               }
           }    
       }

       if(zero_check)
       {
           System.out.println("Identity");
       }
       else
       {
           System.out.println("normal");
   }

}
}