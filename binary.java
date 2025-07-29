public class binary{

public static int binarysearch(int num[], int key){
    int start = 0; 
    int end = num.length -1;
    while(start<= end){
        int mid = (start + end ) / 2;
        if(num[mid]== key){
            return mid;
        }
        if(num[mid]< key){  // right side or the desired element is in 2nd half of the array 
                    start = mid +1;
        }else{
            end = mid -1;
        }
       
    }
       return -1; // -1 means the element is not found in the array
}

    public static void main(String[] args) {
        int num[] ={2,3,5,8,9,10,12,15}; // sorted array
        int key = 10;
        System.out.println("the element is found at index : "+ binarysearch(num,key));
    }
}