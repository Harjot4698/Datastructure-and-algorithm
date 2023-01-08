package v0;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(int[][] grid) {
        // check rows
        for (int i = 0; i < 9; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] != 0 && !set.add(grid[i][j])) {
                    return false;
                }
            }
        }

        // check columns
        for (int j = 0; j < 9; j++) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (grid[i][j] != 0 && !set.add(grid[i][j])) {
                    return false;
                }
            }
        }

        // check 3x3 blocks
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j +=3) {
                Set<Integer> set = new HashSet<>();
                for (int k = 0; k < 9; k++) {
                    int row = i + k / 3;
                    int col = j + k % 3;
                    if (grid[row][col] != 0 && !set.add(grid[row][col])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println(isValidSudoku(grid1)); // should return true

        int[][] grid2 = {            {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 0, 3, 4, 8},
                {1, 0, 0, 3, 4, 2, 5, 6, 0},
                {8, 5, 9, 7, 6, 1, 0, 2, 0},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 0, 1, 5, 3, 7, 2, 1, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 0, 0, 4, 8, 1, 1, 7, 9}
            };
            System.out.println(isValidSudoku(grid2)); // should return false
        }
    }


