import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static int[][] map;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int N;
    static int M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N =Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i=0;i<N; i++){
            char[] value = br.readLine().toCharArray();
            for(int j=0; j<M; j++){
                map[i][j] = value[j] - '0';
            }
        }

        BFS();
        System.out.println(map[N-1][M-1]);

    }

    public static void BFS(){
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(0, 0));
        while (!q.isEmpty()){
            Node now = q.poll();
            for(int i=0; i<4; i++){
                int valueX = now.x + dx[i];
                int valueY = now.y + dy[i];
                if(valueX < 0 || valueX >= N || valueY < 0 || valueY >= M) continue;
                if(map[valueX][valueY] == 1){
                    map[valueX][valueY] = map[now.x][now.y] + 1;
                    q.add(new Node(valueX, valueY));
                }
            }
        }
    }

    public static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

}

