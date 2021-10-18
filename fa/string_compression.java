import java.io.InputStreamReader;
import java.io.BufferedReader;
public class string_compression {

    public static void main(String[] args)throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        String s=f.readLine();
        firstcompression(s);
        secondcompression(s);



        }
        public static void firstcompression(String s){
        int l=0;
        int h=1;
        for(int i=0;i<s.length();i++){
         int ch1=s.charAt(l);
         int ch2=s.charAt(h);
         while(ch1==ch2){
             h++;
             if(h==s.length()){
                 break;
             }
             ch2=s.charAt(h);
         }

            System.out.print(""+s.charAt(l));
            l=h;
            if(h==s.length()){break;}
        }


    }



    public static void secondcompression(String s){
        int l=0;
        int h=0;
        int ch1;
        int ch2=s.charAt(h);

        int count=0;
        for(int i=0;i<s.length();i++){
            ch1=s.charAt(l);

            while(ch1==ch2){
                h++;
                count++;

                if(h==s.length()){
                    break;
                }
                ch2=s.charAt(h);
            }
            System.out.print("" + s.charAt(l) + (count == 1? ("") : (count)));
            l=h;
            count=0;
            if(h==s.length()){
                break;
            }


        }
}
}
