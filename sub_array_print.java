// wap in java to print all possible sub arrays of a given array e.g;{2,4,6,8}---->[2][2,4],[2,4,6],[2,4,6,8],[4],[4,6].......
public class sub_array_print{

public static void subarray(int numb[]){
    for (int i = 0; i < numb.length; i++) {
        int start = i; // outer loop for getting  starting element e.g; start=0 means 0th index element
        for (int j = i; j < numb.length; j++){
             int end = j; // for getting index of the last element upto which subarray will bee printed
            for (int k = start; k <= end; k++) { // from start to end element , it will print the subarray
                System.out.print(numb[k]+" "); // print the subarrays ,then update j and iterate the subarray
            }
             System.out.println(); // will go to next line after printing a subarray as per j

        }
    }
            System.out.println(); // change to next line for new start value
}
    public static void main(String[] args) {
        int numb[] ={1, 2,5,8,9};
        subarray(numb);

    }
}