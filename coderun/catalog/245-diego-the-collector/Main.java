import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
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
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(next());
        int[] stickers = new int[n];
        for (int i = 0; i < n; i++){
            stickers[i] = Integer.parseInt(next());
        }
        Arrays.sort(stickers);
        int m = 0;
        for (int i = 0; i < n; i++){
            if (m == 0 || stickers[i] != stickers[i-1]){
                stickers[m++] = stickers[i];
            }
        }
        int k = Integer.parseInt(next());
        for (int i = 0; i < k; i++){
            int check = Integer.parseInt(next());
            int left = 0;
            int right = m - 1;
            boolean found = false;
            while (right >= left){
                int mid = (right + left) / 2;
                if (stickers[mid] == check){
                    found = true;
                    out.write(mid + "\n");
                    break;
                }
                if (stickers[mid] > check){
                    right = mid - 1;
                }
                else left = mid + 1;
            }
            if (found) continue;
            out.write(left + "\n");

        }
        out.flush();
    }
}