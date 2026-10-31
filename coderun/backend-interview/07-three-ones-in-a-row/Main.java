import java.io.*;
import java.util.*;


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
        int n = Integer.parseInt(next());
        if (n == 1){
            out.write(2 + "\n");
            out.flush();
            return;
        }
        if (n == 2){
            out.write(4 + "\n");
            out.flush();
            return;
        }
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 2;
        table[2] = 4;
        for (int i = 3; i <= n; i++){
            table[i] = table[i-1] + table[i-2] + table[i-3];
        }
        out.write(table[n] + "\n");
        out.flush();
        in.close();
        out.close();
    }
}