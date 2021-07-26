import java.io.*;
import java.util.*;

public class rsb_mask{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
            int x=n&-n;
        System.out.println(Integer.toBinaryString(x));
    }

}