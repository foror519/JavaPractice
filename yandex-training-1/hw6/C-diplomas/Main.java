import java.util.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static String next() throws IOException{
        while (st == null || !st.hasMoreTokens()){
            String line = in.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
    static boolean check(long x, long w, long h, long n) {
        if (x / w == 0 || x / h == 0) return false;
        if (x / w >= n || x / h >= n) return true;
        return (x / w) * (x / h) >= n;
    }
    public static void main(String[] args) throws IOException {
        long w = Integer.parseInt(next());
        long h = Integer.parseInt(next());
        long n = Integer.parseInt(next());
        long right = Math.max(w,h) * n;
        long left = 1;
        while (right > left){
            long mid = (right + left) / 2;
            if (check(mid,w,h,n)) right = mid;
            else left = mid + 1;
        }
        out.write(right + "\n");
        out.flush();
    }
}