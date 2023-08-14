package hashing;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PaintedRowOrCol {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, Integer> mp = new HashMap<>();

        int n = mat.length, m = mat[0].length, ans = (int)1e9;
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                c = Math.max(c, mp.get(mat[i][j]));
            }
            ans = Math.min(ans, c);
        }
        for (int i = 0; i < m; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                c = Math.max(c, mp.get(mat[j][i]));
            }
            ans = Math.min(ans, c);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();
        int[][] mat = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        PaintedRowOrCol solution = new PaintedRowOrCol();
        int result = solution.firstCompleteIndex(arr, mat);
        System.out.println("Result: " + result);
    }
}
