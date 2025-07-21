import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        for (int i = 0; i < M; i++) {
            String inputLine = br.readLine();

            if (inputLine.equals("all")) {
                Arrays.fill(S, true);
            } else if (inputLine.equals("empty")) {
                Arrays.fill(S, false);
            } else {
                StringTokenizer st = new StringTokenizer(inputLine);
                String cal = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                switch (cal) {
                    case "add":
                        S[num] = true;
                        break;
                    case "remove":
                        S[num] = false;
                        break;
                    case "check":
                        bw.write(S[num] ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        S[num] = !S[num];
                        break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
