import java.util.*;
import java.io.*;

public class Main{
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
        long n = Integer.parseInt(next());
        int x = 1;
        int count = 0;
        while (x < n){
            x = x * 2;
            count++;
        }
        out.write(count + "\n");
        out.flush();
    }
}