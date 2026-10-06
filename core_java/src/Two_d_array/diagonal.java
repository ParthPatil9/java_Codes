package Two_d_array;

public class diagonal{

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       /*
        * 1 7
        * 0 1
        *
        *
        */
       
       int [][] arr=new int[2][2];
       
       arr[0][0]=1;
       arr[0][1]=0;
       arr[1][0]=0;
       arr[1][1]=1;
       
       boolean zero_check=true;
       
       boolean one_check=true;
       
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               if(i==j)
               {
                   if(arr[i][j]!=1)
                   {
                       one_check=false;
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

       if(one_check && zero_check)
       {
           System.out.println("diagonal");
       }
       else
       {
           System.out.println("normal");
   }

}
}