package Backtracking.UniquePermutationsOfAstring.RatInAMaze;

import java.util.ArrayList;

public class BacktrackingMethod {
    public static ArrayList<StringBuilder> pathFinder(int[][] arr, int n) {
        ArrayList<StringBuilder> list = new ArrayList<>(); //list of all path;
        StringBuilder path = new StringBuilder();
        int x = 0;
        int y = 0;
        boolean[][] visited = new boolean[n][n];
        solve(arr, visited, x, y, list, path, n);
        return list;
    }
    public static void solve(int[][] arr, boolean[][] visited, int x , int y, ArrayList<StringBuilder> list, StringBuilder path, int n){
        if(x == n-1 && y == n-1){// reached the end
            list.add(new StringBuilder(path));
            return; //return to the backtracking part
        }
        visited[x][y] = true;
        //choices
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'}; // 4 directions rat can go in
        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && ny>=0 && ny<n && nx<n && !visited[nx][ny] && arr[nx][ny]==1){
                path.append(dir[i]);
                solve(arr,visited,nx,ny,list,path,n);
                path.deleteCharAt(path.length()-1); //after adding the correct path to list it returns here and backtracks
            }
        }
        visited[x][y] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };
        System.out.println(pathFinder(maze,4));
    }
}
