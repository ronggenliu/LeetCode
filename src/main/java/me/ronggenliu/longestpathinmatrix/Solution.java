package me.ronggenliu.longestpathinmatrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Gary Liu on 2018/11/23.
 */
public class Solution {
    public static final int[][] dirs = {{0, 1}, {1, 0}};

    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        Solution solution = new Solution();
        System.out.println(solution.longestIncreasingPath(args[0]));
    }

    public int longestIncreasingPath(String filePath) {
        Matrix matrix = new Matrix(filePath);
        if (matrix.array.length == 0) return 0;
        int m = matrix.n, n = matrix.m;
        int[][] cache = new int[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tempMax = dfs(matrix.array, i, j, m, n, cache);
                max = Math.max(max, tempMax);
            }
        }
        return max;
    }

    public int dfs(int[][] array, int i, int j, int m, int n, int[][] cache) {
        if (cache[i][j] != 0) return cache[i][j];
        int max = array[i][j];
        for (int[] dir : dirs) {
            int x = i + dir[0], y = j + dir[1];
            if (x < 0 || x >= m || y < 0 || y >= n) continue;
            int val = array[i][j] + dfs(array, x, y, m, n, cache);
            max = Math.max(max, val);
        }
        cache[i][j] = max;
        return max;
    }

    class Matrix {
        int m;
        int n;
        int[][] array;
        String filePath;

        Matrix(String filePath) {
            this.filePath = filePath;
            try {
                readInputFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void readInputFile() throws Exception {
            File f = new File(this.filePath);
            try (FileReader fileReader = new FileReader(f)) {
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    String line = bufferedReader.readLine();
                    String[] mn = line.split(",");
                    this.m = Integer.parseInt(mn[0].replaceAll(" ", ""));
                    System.out.println("M: " + m);
                    this.n = Integer.parseInt(mn[1].replaceAll(" ", ""));
                    System.out.println("N: " + n);
                    array = new int[n][m];
                    int i = 0;
                    while ((line = bufferedReader.readLine()) != null && i < n) {
                        String[] row = line.split(",");
                        for (int k = 0; k < m; k++) {
                            array[i][k] = Integer.parseInt(row[k].replaceAll(" ", ""));
                        }
                        i++;
                    }
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < m; k++) {
                            System.out.print(array[j][k]);
                            if(k == m - 1) {
                                System.out.println("");
                            }
                        }
                    }
                }
            }

        }
    }

}
