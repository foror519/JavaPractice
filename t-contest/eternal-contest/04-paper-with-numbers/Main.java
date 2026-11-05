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
        int k = Integer.parseInt(next());
        int[] array = new int[n];
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(next());
            int digits = (int)Math.log10(array[i]) + 1;
            for (int j = 0; j < digits; j++){
                list.add((long) ((9 - array[i] % 10) * Math.pow(10, j)));
                array[i] /= 10;
            }
        }
        long result = 0;
        list.sort(Collections.reverseOrder());
        for (long x: list){
            result += x;
            k--;
            if (k == 0) break;
        }
        out.write(result + "\n");
        out.flush();
    }
}