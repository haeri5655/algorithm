import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        String[] stringNumbers = scanner.nextLine().split(" ");
        int[] nums = new int[n];
        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(stringNumbers[i]);
            total[i] = nums[i];

            if (i > 0) {
                total[i] += total[i - 1];
            }
        }

        for (int idx = 0; idx < m; idx++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            if (i == j) {
                System.out.println(nums[i - 1]);
            } else if (i == 1) {
                System.out.println(total[j - 1]);
            } else {
                System.out.println(total[j - 1] - total[i - 2]);
            }
        }

        scanner.close();
    }
}