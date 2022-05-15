package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로탈출
// https://www.youtube.com/watch?v=7C9RgOcvkvo

// 동빈 위치: (1,1)
// 출구 위치: (N,M)

// 괴물 존재 -> 0
// 괴물 존재 X -> 1

//동빈이가 탈출하기 위해 윰직여야 하는 최소 칸의 개수 (+ 시작칸과 마지막 칸 모두 포함해서 계산)
// BFS : 간선의 비용이 모두 같을 때, 최단 거리를 탐색하기 위해 사용하는 알고리즘

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

// 인접행렬 풀이
public class Escape_From_The_Maze {

    public static int N, M, cnt = 0;
    public static int[] graph[] = new int[201][201];

    // 이동할 네 가지 방향 정의 (상, 하, 좌, 우) => 좌, 우, 상, 하
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static int bfs(int x, int y) {
        // 큐(Queue) 구현을 위해 queue 라이브러리 사용
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        // 큐가 빌 때까지 반복하기
        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= N || ny < 0 || ny >= M)
                    continue;
                // 벽인 경우 무시
                if (graph[nx][ny] == 0)
                    continue;
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        // 가장 오른쪽 아래까지의 최단 거리 반환
        return graph[N - 1][M - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();  // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 1; i < N + 1; i++) {
            String str = sc.nextLine();
            for (int j = 1; j < M + 1; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // BFS를 수행한 결과 출력
        System.out.println(bfs(0, 0));
    }
}