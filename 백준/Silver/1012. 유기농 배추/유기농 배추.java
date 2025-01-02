import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;   // 그래프의 연결 상태를 알려줌
    static boolean[][] visited; // DFS로 탐색할 때 이미 방문한 노드를 건너뛰기 위해 기록
    static int M, N, K;         // 가로(M), 세로(N), 배추 위치 개수(K)
    static int count;           // 필요한 배추흰지렁이 수

    // 상, 하, 좌, 우 탐색을 위한 배열
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            K = Integer.parseInt(st.nextToken()); // 배추 위치 개수

            graph = new boolean[M][N];  // 배추밭 초기화
            visited = new boolean[M][N]; // 방문 배열 초기화

            // 배추 위치 입력받기
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true; // 배추 심어진 곳을 true로 표시
            }

            count = 0; // 각 테스트 케이스마다 흰지렁이 수 초기화

            // 모든 위치를 탐색하면서 배추가 있고 방문하지 않은 곳에서 DFS 시작
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][j] && !visited[i][j]) {
                        dfs(i, j); // 새로운 배추 군집을 발견할 때마다 DFS 수행
                        count++;   // 한 군집이 끝나면 지렁이 한 마리 필요
                    }
                }
            }

            sb.append(count).append("\n"); // 결과 저장
        }

        bw.write(sb.toString()); // 결과 출력
        bw.flush();

        br.close();
        bw.close();
    }

    // DFS로 배추밭 탐색
    static void dfs(int x, int y) {
        visited[x][y] = true; // 현재 위치 방문 처리

        // 상하좌우로 이동
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 이동한 좌표가 유효한 범위 안에 있고, 배추가 있으며 방문하지 않은 경우 DFS 재귀 호출
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (graph[nx][ny] && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
