import java.io.*;
import java.util.StringTokenizer;

public class Main{
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            String line = in.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(next());
        int [] a1 = new int [n];
        for (int i = 0; i < n; i++){
            a1[i] = Integer.parseInt(next());
        }
        int m = Integer.parseInt(next());
        int [] a2 = new int[m];
        for (int i = 0; i < m; i++){
            a2[i] = Integer.parseInt(next());
        }
        int bestDiff = Integer.MAX_VALUE;
        int bestA = a1[0];
        int bestB = a2[0];
        int i = 0;
        int j = 0;
        while (i < n && j < m){
            if (bestDiff > Math.abs(a1[i] - a2[j])){
                bestDiff = Math.abs(a1[i] - a2[j]);
                bestA = a1[i];
                bestB = a2[j];
            }
            if (Math.abs(a1[i] - a2[j]) == 0) {
                break;
            }
            if (a1[i] > a2[j]) j++;
            else i++;
        }
        out.write(bestA + " " + bestB);
        out.flush();
    }
}