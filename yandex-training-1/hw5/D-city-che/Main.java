import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    static String next() throws IOException{
        while (st == null || !st.hasMoreTokens()){
            String line = in.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException{
        int d = Integer.parseInt(next());
        int r = Integer.parseInt(next());
        int [] monuments = new int [d];
        for (int i = 0; i < d; i++){
            monuments[i] = Integer.parseInt(next());
        }
        int move = 0;
        long ans = 0;
        for (int i = 0; i < d; i++){
            while (monuments[i] - monuments[move] > r) move++;
            ans += move;
        }
        out.write(String.valueOf(ans));
        out.flush();
    }
}