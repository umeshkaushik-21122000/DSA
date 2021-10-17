import java.io.*;
import java.util.*;

public class maze{

    public static void main(String[] args) throws Exception {
BufferedReader f=new BufferedReader(new InputStreamReader(System.in));

        int dr=Integer.parseInt(f.readLine());
        int dc=Integer.parseInt(f.readLine());
        ArrayList<String>k=getMazePaths(1,1,dr,dc);
        System.out.println(k);
    }


    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
     if(sr==dr&&sc==dc){
      ArrayList<String>startingarraylist=new ArrayList<>();
      startingarraylist.add("");
      return startingarraylist;
     }
        ArrayList<String>block1=new ArrayList<>();
     if(sr<dr){
        block1=getMazePaths(sr+1,sc,dr,dc);
     }
        ArrayList<String>block2=new ArrayList<>();
     if(sc<dc){
         block2=getMazePaths(sr,sc+1,dr,dc);
     }


        ArrayList<String>myblock=new ArrayList<>();
        for(String mypath:block2){
            myblock.add("h"+mypath);
        }
     for(String mypath :block1){
            myblock.add("v"+mypath);
        }

    return myblock;
    }

}
