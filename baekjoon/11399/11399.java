import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputLine = scanner.nextLine().split(" ");

        int[] P = new int[N];
        for (int i=0; i<N; i++) {
            P[i] = Integer.parseInt(inputLine[i]);
        }

        Arrays.sort(P);

        int total = P[0];

        for (int i=1; i<N; i++) {
            P[i] += P[i - 1];
            total += P[i];
        }

        System.out.println(total);

        scanner.close();
    }
}