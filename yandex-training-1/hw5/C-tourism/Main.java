import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = in.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(next());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            next();
            array[i] = Integer.parseInt(next());
        }

        int[] prefUp = new int[n];   
        int[] prefDown = new int[n]; 
        for (int i = 1; i < n; i++) {
            int d = array[i] - array[i - 1];
            prefUp[i] = prefUp[i - 1] + (d > 0 ? d : 0);
            prefDown[i] = prefDown[i - 1] + (d < 0 ? -d : 0);
        }

        int m = Integer.parseInt(next());
        for (int i = 0; i < m; i++) {
            int start = Integer.parseInt(next()) - 1;
            int end = Integer.parseInt(next()) - 1;
            int ans;
            if (start <= end) {
                ans = prefUp[end] - prefUp[start];
            } else {
                ans = prefDown[start] - prefDown[end];
            }
            out.write(ans + "\n");
        }
        out.flush();
    }
}