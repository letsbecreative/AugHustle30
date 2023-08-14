package hashing;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConvertArrTo2Darr {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean ins = false;
            for (int j = 0; j < ans.size(); j++) {
                boolean ch = false;
                for (int k = 0; k < ans.get(j).size(); k++) {
                    if (ans.get(j).get(k) == nums[i]) {
                        ch = true;
                    }
                }
                if (!ch) {
                    ans.get(j).add(nums[i]);
                    ins = true;
                    break;
                }
            }
            if (!ins) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                ans.add(list);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
//        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        ConvertArrTo2Darr solution = new ConvertArrTo2Darr();
        List<List<Integer>> result = solution.findMatrix(nums);
        System.out.println(result);
    }
}
