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
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(next());
        int k = Integer.parseInt(next());
        int [] nArray = new int [n];
        int [] kArray = new int [k];
        for (int i = 0; i < n; i++){
            nArray[i] = Integer.parseInt(next());
        }
        for (int i = 0; i < k; i++){
            kArray[i] = Integer.parseInt(next());
            int left = 0;
            int right = n - 1;
            boolean res = false;
            while (right >= left){
                int mid = (left + right) / 2;
                if (kArray[i] == nArray[mid]){
                    res = true;
                    out.write(nArray[mid] + "\n");
                    break;
                }
                else if (kArray[i] > nArray[mid]){
                    left = mid + 1;
                }
                else right = mid - 1;
            }
            if (res) continue;
            if (right == -1){
                out.write(nArray[0] + "\n");
                continue;
            }
            if (left == n) {
                out.write(nArray[n - 1] + "\n");
                continue;
            }
            if (right == left) out.write(nArray[right] + "\n");
            if (Math.abs((long) kArray[i] - nArray[right]) > Math.abs((long) kArray[i] - nArray[left])) out.write(nArray[left] + "\n");
            else out.write(nArray[right] + "\n");
        }
        out.flush();
    }
}