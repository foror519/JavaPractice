import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()){
            String line = in.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        while (true){
            String token = next();
            if (token == null || token.equals("\0")) break;
            list.add(token);
        }
        out.write((list.stream().distinct().count()) + "\n");
        out.flush();
    }
}