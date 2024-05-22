import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] map;
    static int N;
    static ArrayList<Integer> answer = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i=0; i<N; i++){
            char[] value = br.readLine().toCharArray();
            for(int j=0; j<value.length; j++){
                map[i][j] = value[j] -'0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1){
                    answer.add(DFS(i, j));
                }
            }
        }

        StringBuilder sb = new StringBuilder(answer.size() + "\n");
        Collections.sort(answer);
        for(int i=0; i<answer.size(); i++){
            sb.append(answer.get(i)).append("\n");
        }
        System.out.println(sb);


    }

    static int DFS(int x, int y){
        int sum = 1;

        map[x][y] = 2;
        for(int i=0; i<4; i++){
            int valueX = x + dx[i];
            int valueY = y + dy[i];
            if(valueX < 0 || valueX >= N || valueY <0 || valueY >= N) continue;
            if(map[x + dx[i]][y+dy[i]] == 1){
                map[x + dx[i]][y+dy[i]] = 2;
                sum += DFS(x + dx[i], y + dy[i]);
            }
        }

        return sum;



    }

}

