public class reverse_array{
public static void reverse(int arr[]){
    int first =0 , last = arr.length-1;
   // swapping the values between different index of the array
    while(first<last){  //<= operator is not requied here because < will perform the same function here
int temp = arr[last]; // taking a temp variable to store the last index value into first index of array after moving the value of first index into last index 
arr[last]= arr[first];// as arr[last] is empty, we are assing arr[first] element into it
  arr[first]= temp;
  first++;  // index will move forward by 1 after every iteration from 0
  last--;   // index will move backward by 1 after evert iteration from arr.lenth-1 
    }
}
    public static void main (String[] args){
    int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12};
    System.out.print("original array is: ");
    for(int i = 0; i < arr.length; i++)
   { System.out.print(" "+arr[i]); 
    
   }
   System.out.println();
   System.out.print("reversed array is:");
    reverse(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(" "+arr[i]);
    }


    }
}