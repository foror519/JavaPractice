import java.util.*;
import java.io.*;

public class Main{

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

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
        int [] nArray = new int[n];
        int [] kArray = new int[k];
        for (int i = 0; i < n; i++){
            nArray[i] = Integer.parseInt(next());
        }
        Arrays.sort(nArray);
        for (int i = 0; i < k; i++){
            kArray[i] = Integer.parseInt(next());
            int left = 0;
            int right = n - 1;
            boolean res = false;
            while (left <= right){
                int mid = (left + right) / 2;
                if (nArray[mid] == kArray[i]){
                    res = true;
                    break;
                }
                else if (nArray[mid] < kArray[i]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            if (res){
                out.write("YES\n");
            }
            else{
                out.write("NO\n");
            }
        }
        out.flush();
    }
}