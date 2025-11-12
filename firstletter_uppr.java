//wap to convert the first letter of each word in a string to uppercase
import java.util.*;
public class firstletter_uppr{
    public static String upper( String str){
        StringBuilder sb = new StringBuilder();
        char ch =charecter.toUpperCase(str.charAt(0));
            sb.append(ch);// adding 1st char in sb
            for(int i = 1;i<str.length();i++){
                if(str.charAt(i)==''){//&& i<str.length()-1)
                sb.append(charAt(i));
                i++;
                sb.append(charecter.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));

            }
    }
 return sb.toString();
    }

public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the string value:");
    String str= sc.nextLine();
    System.out.println(upper(str));
}
}