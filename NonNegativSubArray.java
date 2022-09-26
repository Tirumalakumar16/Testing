import java.util.ArrayList;

public class NonNegativSubArray {

    public int[] findingNonSubArray(int [] arr){
        int n=arr.length;
        ArrayList<Integer> New =new ArrayList<>();
        ArrayList<Integer> Max = new ArrayList<>();
        int Maximum_sub_Array_Sum =0;
        int Updating_New_sum =0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                Updating_New_sum = Updating_New_sum+arr[i];
                New.add(arr[i]);

            }
            else {
                Updating_New_sum=0;
                New = new ArrayList<>();
            }
            if((Maximum_sub_Array_Sum < Updating_New_sum) || ((Maximum_sub_Array_Sum == Updating_New_sum) && (Max.size() < New.size()))){

                Maximum_sub_Array_Sum = Updating_New_sum;
                Max = New;
            } 

            
            }
            int [] ar = new int [Max.size()];
            int m=ar.length;
            for(int ktk=0;ktk<m;ktk++){

                ar[ktk] = Max.get(ktk);
        }
        return ar;
    }
      public static void main(String[] args) {
        

       int [] arr= {1,2,-5,100,5,-7,2,3,5};

       NonNegativSubArray list = new NonNegativSubArray();


       int [] Deekshith =list.findingNonSubArray(arr);


       int n= Deekshith.length;

       for(int i=0;i<n;i++){
        System.out.print(Deekshith[i] + " ");
       }






      }
}
