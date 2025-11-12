public class selectionsort{

    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++)// for each turn where swapping wil be held
        {
            int minpos=i;// assuming the min pos initially at ith index
        for(int j =i+1;j<arr.length;j++)// j=i+1 as it will compare with next value not with same value at ith pos, if value is less than minpos then update minpos 
            if(arr[minpos]>arr[j]){ // > because we will sort in accending order, for decending sort use <
                minpos=j;
            }
            // after getting min value in each turn , we will swap with the ith index value
            //swap
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;// in selection sort, swapping occurs less time than bubble sort
    }
    }

    public static void printArr6
    3 (int arr[]){
        for (int k = 0; k < arr.length; k++) {
                 System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args){
        int arr[]= {4,5,8,7,9,2,40,69,10,1};
        selectionSort(arr);
        printArr(arr);
    }
}