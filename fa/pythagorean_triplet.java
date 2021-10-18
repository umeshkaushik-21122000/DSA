
import java.util.*;
public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        int b=my.nextInt();
        int c=my.nextInt();
        if((a*a)==((b*b)+(c*c))){
            System.out.println("true");}
        else if((b*b)==((a*a)+(c*c)))
        {System.out.println("true");}
        else if((c*c)==((b*b)+(a*a)))
        {  System.out.println("true");}
        else
        { System.out.println("false");}




    }
}
