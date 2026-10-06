package Two_d_array;

public class Scalar_matrix{

   public static void main(String[] args) {
     
       int [][] arr=new int[2][2];
       
       arr[0][0]=2;
       arr[0][1]=0;
       arr[1][0]=0;
       arr[1][1]=2;
       
       boolean sameVal_check=true;
       
       for(int i=0;i<arr.length;i++){
    	   
           for(int j=0;j<arr[i].length;j++){
        	   
               if(i==j){
                   if(arr[i][j]!=arr[0][0]){
                	   sameVal_check=false;
                       break;}
               }
               else{
                   if(arr[i][j] !=0){
                	   sameVal_check=false;
                       break;
                   }
               }
           }
           if(!sameVal_check) {
        	   break;
           }
       }

       if(sameVal_check & arr[0][0]!=0 && arr[0][0]!=1){
           System.out.println("Scalar");
       }
       else{
           System.out.println("normal");
   }

}
}