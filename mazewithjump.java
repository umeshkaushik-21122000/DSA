import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class mazewithjump {
    public static void main(String[] args) throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(f.readLine());
        int y=Integer.parseInt(f.readLine());
        ArrayList<String>getmaze=getMazePaths(1,1,x,y);
        System.out.println(getmaze);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc){
         ArrayList<String>hh=new ArrayList<>();
         hh.add("");
         return hh;
        }ArrayList<String>allpath=new ArrayList<>();
        ArrayList<String>vpath=new ArrayList<>();
        if(sc<dc){
            for(int i=1;i<dc;i++){
                vpath=getMazePaths(sr,sc+i,dr,dc);
                for(String h:vpath){
                    allpath.add("h"+i+h);
                }
            }

        }
        ArrayList<String>hpath=new ArrayList<>();
        if(sr<dr) {
            for (int i = 1; i < dr; i++) {
                hpath = getMazePaths(sr + i, sc, dr, dc);
                for(String h:hpath){
                    allpath.add("v"+i+h);
                }
            }

        }
        ArrayList<String>dpath=new ArrayList<>();
        if(sr<dr&&sc<dc) {
            for (int i = 1; i < dr && i<dc; i++) {
                dpath = getMazePaths(sr + i, sc + i, dr, dc);
                for(String h:dpath){
                    allpath.add("d"+i+h);
                }
            }
        }
        return allpath;
    }

}