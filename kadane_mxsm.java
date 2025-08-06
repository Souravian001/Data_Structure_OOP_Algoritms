//wap to find max sum of subarray of a given array using KADANe's algorithm...it will use only single loop for solving means O(n) time complexity it will produce
// it is the most optimized appoach for finding the max sum of subarray of a given array
// negetive values can not be taken as the result of addition by this algo noramlly because the sum will reset to 0 when there is a -ve sum value, we will just do a minor change in this algo  for a array having full -ve elements
public class kadane_mxsm{

    public static void kadane_max(int numb[]){
        int sum=0;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i<numb.length; i++){
                sum= sum+numb[i];
                if(sum<0){   // it will not take any negetive value and if the addition between neg and pos value is greater than 0,then it will store it
                    sum=0;
                }
                max= Math.max(max, sum);
      
        }
        System.out.println("the max sum of subarray is: "+ max);
    }
    public static void main(String[] args) {
        int numb []={1,5,-1,-9,-8,-19,-52,100,458,-9,874,12,487,-87,8,4,541,587};
        kadane_max(numb);
    }
}
