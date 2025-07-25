public class linear_search{
 public static int linarsearch(int array[], int key){
    for(int i=0;i<array.length;i++){
        if(array[i]== key){
            return i;// return the index at which the element is present
        }
        //return -1;// if desired element is not found
    }       
     return -1;// if desired element is not found

 }
public static void main(String[] args) {
    int array[]= {1,2,5,6,63,66,67,68,69};
    int key = 63;
    int index = linarsearch(array,key);
    if (index== -1){
        System.out.println("not found");
    }else{
        System.out.println("element is foun at "+ index);
    }
}

}

