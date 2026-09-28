import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String line = in.readLine();
        if (line == null || line.trim().isEmpty()) {
            System.out.print("YES");
            return;
        }

        StringTokenizer st = new StringTokenizer(line);
        int n = st.countTokens();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }
        int counter = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i-1] < a[i] && a[i] > a[i+1]) {
                counter++;
            }
        }
        System.out.print(counter);
    }
}