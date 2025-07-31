// wap in java to find all possible unique pair of element in a given array e.g; {2,3,4,5} --->(2,3),(2,4),(2,5),(3,4)....etc 
public class pair_in_array{
public static int pair_in_arr(int array[]){
    int tp = 0; // tp = total no. of pair which will be also returned by this funtion along with pair
    for (int i = 0; i < array.length; i++) {
        int current = array[i];
        for (int j = i+1; j < array.length; j++){// inner loop will give the next element of the pair & j=i+1 because it will fetch the value of next index of i
            System.out.print("("+ current+","+ array[j]+")");
            tp++;// will update tp after printing each pair
        }
        System.out.println(); // for next line for understanding properly
    }
    return tp;
}
public static void main(String[] args) {
    int array[] ={ 1,2,3,4,5,6,7,8};
   int totai_pair= pair_in_arr(array);
    System.out.println("the no. of total pair: "+ totai_pair);
}

} 





