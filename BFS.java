import java.io.*;
import java.util.*;

public class BFS {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }
    public static class pair{
        String psf;
            int v;
            pair(int v, String psf){
                this.v = v;
                this.psf=psf;
            }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        Queue<pair>a=new ArrayDeque<>();
        boolean[]visited=new boolean[vtces];
        a.add(new pair(src,src+""));
        while(a.size()>0){
            pair x=a.remove();
            if(visited[x.v]==false){
                visited[x.v]=true;
                System.out.println(x.v+"@"+x.psf);
                for(Edge s :graph[x.v] ){
                    if(!visited[s.nbr])
                    a.add(new pair(s.nbr,x.psf+s.nbr));
                }
            }

        }
    }
}