// wap in java to return sum of all posible subarray and return the max sum of subarray in a given array e.g;[2,4,5]------>2,6,11,4,9....max=11
// brute force approach
public class max_sum_subarray{
    public static void mx_sum_Subarray(int arr[]){ 
        // int sum=0;
         int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {

            int start = i; // for getting the first element of subarray
            for (int j = i; j < arr.length; j++){ // for getting the last element of subarray upto which sum will be calculated
                int end = j;
                int sum =0;   // for each next subarray the count will be 0 to properly calculate the sum
                for(int k=start; k<=end;k++){//for printing the element of the subarray between start and end element
                sum=sum+arr[k]; // will add elements of subarray and store it in sum variable
                 }
                  System.out.print(sum +" ");
                    if(max<sum){
                        max = sum;  // comparing the value with max and storing it in max
                       
                    }
            }
            System.out.println();
            }
             System.out.println("the max sum of subarray is :"+ max);
        }

    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8};
        mx_sum_Subarray(arr);
    }
}
