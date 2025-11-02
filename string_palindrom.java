//wap to check a string is palindrom or not.i.e,palindrome strings are those strings which will remain same after being reversed, e.g: aba--->aba,cat--->tac, not palindrom
import java.util.*;
public class string_palindrom{
    public static boolean palindrom( String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nn = sc.next();
                //palindrom(nn);
    System.out.println(palindrom(nn));}
    
}