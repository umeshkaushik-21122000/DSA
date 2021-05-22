import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class arrange_buildeing {

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        combo(n);
    }
    public static void combo(int n){
        BigInteger building=new BigInteger("1");
        BigInteger space=new BigInteger("1");
        for(int i=2;i<=n;i++){
            BigInteger nspace=building.add(space);
            BigInteger nbuilding=space;
            building=nbuilding;
            space=nspace;
        }
        BigInteger x=building.add(space);
        BigInteger y=x.multiply(x);
        System.out.println(y);
    }
}