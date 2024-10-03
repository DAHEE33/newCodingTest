import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;   //그래프의 = 연결 상태를 알려줌
    static boolean[] visited;   //DFS로 탐색 할 때 이미 방문한 노드를 건너뛰기 위해 기록
    static int N, M;        // 노드 개수 & 간선 개수
    static int count;       //바이러스에 걸리는 컴퓨터의 수 = DFS로 접근한 노드의 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N + 1][N + 1];  //0번을 사용하지 않고 헷갈리지 않게 1부터 사용
        visited = new boolean[N + 1];

        int x, y;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

			//간선 A-B의 연결은 방향성이 없기 때문에 A to B, B to A 모두 연결 표시
            graph[x][y] = true;     
            graph[y][x] = true;
        }

        dfs(1);         //1번 컴퓨터부터 감염이 시작됨

		//1번을 통해 감염된 컴퓨터의 수이기 때문에 1번은 제외
        bw.write(String.valueOf(count - 1));
        
        br.close();
        bw.close();
    }

    static void dfs(int idx) {
        visited[idx] = true;  //DFS가 호출된 idx는 해당 노드는 방문 처리
        count++;        //접근 카운트 증가

        for (int i = 1; i <= N; i++) {    //0번을 버리기로 했기 때문에 1~N(포함) 반복
        	//그래프와 연결된 노드를 찾은 후 방문하지 않았다면
            if (visited[i] == false && graph[idx][i]) {     
                dfs(i);     //방문
            }
        }
    }
}