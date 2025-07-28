// problem: wap to find the largest element in array e.g; array[]={4,400,51,20,21,26,78,45,235}
public class largest{
    public static int largest_element( int num[]){
        int large = Integer.MIN_VALUE;// start with the smallest possible value which is -infinity, we use Integer.MIN_VALUE to represent it
        for (int i = 0; i < num.length; i++) {
            if(large < num[i]){     // if the value at ith index of array is larger than large variable ,then the bigger value will be assined to large
                large = num[i];   
            }
        }
            return large;
    }
    public static void main(String[] args) {
        int num[]= {4,400,51,20,21,26,78,56,50,36,39,36,28,45,235};
        System.out.println("the largest element is:"+ largest_element(num));
        // similarly for finding  smallest element in array use Infinit.MAX_VALUE as small variable in replacement of large variable and (small> a[i])
    } 
} 
