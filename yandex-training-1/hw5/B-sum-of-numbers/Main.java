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

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(next());
        int k = Integer.parseInt(next());
        int [] array = new int[n];
        int [] sArray = new int[n+1];
        sArray[0] = 0;
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(next());
            sArray[i+1] = sArray[i] + array[i];
        }
        int left = 0;
        int right = 1;
        int counter = 0;
        while (right < n + 1){
            if (sArray[right] - sArray[left] > k) left++;
            else if (sArray[right] - sArray[left] < k) right++;
            else{
                counter++;
                right++;
            }
        }
        out.write(String.valueOf(counter));
        out.flush();
    }
}