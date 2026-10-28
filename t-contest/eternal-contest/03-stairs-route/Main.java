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
        int n = Integer.parseInt(next());
        int t = Integer.parseInt(next());
        int[] ppl = new int[n];
        for (int i = 0; i < n; i++) {
            ppl[i] = Integer.parseInt(next());
        }
        int target = Integer.parseInt(next());
        if (t >= ppl[target-1] - ppl[0] || t >= ppl[n-1] - ppl[target-1]){
            out.write(ppl[n-1] - ppl[0] + "\n");
            out.flush();
            return;
        }
        if (ppl[n-1] - ppl[target-1] < ppl[target-1] - ppl[0]){
            out.write((ppl[n-1] - ppl[target-1] + ppl[n-1] - ppl[0]) + "\n");
            out.flush();
            return;
        }
        else{
            out.write((ppl[target-1] - ppl[0] + ppl[n-1] - ppl[0]) + "\n");
            out.flush();
        }
        out.flush();
        out.close();
    }
}