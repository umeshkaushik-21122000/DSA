import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class recursionnew{

    public static void main(String [] args)throws Exception{
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        String str=f.readLine();
        ArrayList<String>x=gss(str);
        System.out.println(x);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
          return new ArrayList<>();
        }
        char ch=str.charAt(0);
            str=str.substring(1);
            ArrayList<String>l=gss(str);
              if(l.size()==0){l.add(str);}
               int t=l.size();
            for(int i=0;i<t;i++){
             String h=ch+l.get(i);                     //corrcet loop
             l.add(h);
            }
   return l;
    }
}
