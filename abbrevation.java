import java.util.*;
public class abbrevation{
    public static void solution(String str, String asf,int count, int pos){
        if(pos==str.length()){
            if(count>0){
                asf+=count;
            }
                System.out.println(asf);
            return;
        }
        solution(str,asf+(count>0?count : "")+str.charAt(pos),0,pos+1);
        solution(str,asf,count+1,pos+1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str,"",0,0);
    }
}