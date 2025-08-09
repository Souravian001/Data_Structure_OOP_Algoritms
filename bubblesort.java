//wap to implement bubble sort algorithm
// larger elements come to the end of array by swapping with the adjacent element
public class bubblesort{

public static void bubble(int numb[]){
    for (int turn = 0; turn <numb.length-1; turn++) { //for each turn,total no of turn = n-2 
        for(int j=0;j<numb.length-1-turn;j++){ // for swaaping in each turn, EACH TURN WILL STOP AFTER DOING OPERATION UPTO NUMB.LENTH-1-TURN TH INDEX
            //swaping between two adjacent element
            if(numb[j]>numb[j+1]){
            int temp = numb[j];  
            numb[j]= numb[j+1]; 
            numb[j+1]=temp;
            }
        }
        
    }
}
public static void display(int numb[]){
    for (int i = 0; i < numb.length; i++) {
        System.out.print(numb[i]+" ");
        
    }

}
   
    public static void main(String[] args) {
        int numb[]={2,8,10,55,11,-4,Integer.MAX_VALUE,214748,20};
        bubble(numb);
        display(numb);

        
    }
}