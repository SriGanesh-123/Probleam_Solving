package Advanced;
import java.util.*;

public class MazeShortestPath {
    public static int shortestPath(int[][] maze, int[] start, int[] target) {
        int m = maze.length, n = maze[0].length;
        boolean[][] vis = new boolean[m][n];
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start[0], start[1], 0});
        vis[start[0]][start[1]] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], d = cur[2];
            if (r == target[0] && c == target[1]) return d;
            for (int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr >= 0 && nc >= 0 && nr < m && nc < n && !vis[nr][nc] && maze[nr][nc] == 0) {
                    vis[nr][nc] = true;
                    q.add(new int[]{nr, nc, d+1});
                }
            }
        }
        return -1; // unreachable
    }

    public static void main(String[] args) {
        int[][] maze = {
            {0,0,1,0},
            {0,0,0,0},
            {0,1,0,1},
            {0,0,0,0}
        };
        System.out.println(shortestPath(maze, new int[]{0,0}, new int[]{3,3})); // e.g. 6
    }
}
