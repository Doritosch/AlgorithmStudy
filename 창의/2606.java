import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static int visit;
    static ArrayList<Integer>[] A;
    static int max = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        A = new ArrayList[N+1];
        for(int i=1; i<N+1; i++){
            A[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            A[x].add(y);
            A[y].add(x);
        }
        DFS(0, 1);
        System.out.println(max);


    }

    public static void DFS(int depth, int now){
        max = Math.max(depth, max);

        visit |= (1 << now);
        for(int a : A[now]){
            if((visit & (1 << a)) == ( 1 << a)) {
                DFS(depth + 1, a);
            }
        }
    }

}


