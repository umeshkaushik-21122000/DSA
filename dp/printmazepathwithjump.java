import java.util.*;

public class printmazepathwithjump {

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int dr=my.nextInt();
        int dc=my.nextInt();
        printMazePaths(1,1,dr,dc,"");
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
            if(sr==dr&&sc==dc){
                System.out.println(psf);
                return;
            }
                for(int i=1;i<dc;i++) {
                    if(sc<dc)
                    {
                        printMazePaths(sr , sc+i, dr, dc, psf + "h" + i);
                    }
                }
        for(int i=1;i<dr;i++) {
            if(sr<dr) {
                printMazePaths(sr + i, sc, dr, dc, psf + "v" + i);
            }
        }
        for(int i=1;i<dr&&i<dc;i++) {
            if(sr<dr&&sc<dc){
                printMazePaths(sr + i, sc+i, dr, dc, psf + "d" + i);
            }
        }
    }

}
