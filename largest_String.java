// wap to find the largest string among three strings
//we will use CompareTo() function which will lexographically compare each charecter of each string
import java.util.*;
public class largest_String{ 
    public static void main(String[] args){
        String arr[]={"apple","banana","mango","Watermelon","guava"};
        String largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareTo(arr[i]) < 0){ // if the value stored in largest variable is less than ith element of arr then assign the value in largest 
                largest= arr[i];
            }
        }
        System.out.println("the lexographically large string is: "+ largest);
    }

}