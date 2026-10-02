import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = in.readLine();
            if (line == null) return null;
            else st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(next());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s1 = next();
            String s2 = next();
            map.put(s1, s2);
            map.put(s2, s1);
        }
        String find = next();
        out.write(map.get(find));
        out.flush();
    }
}
