import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String next() throws IOException{
        while (st == null || !st.hasMoreTokens()){
            String line = reader.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
    public static void main(String[] args) throws IOException {

        int k = Integer.parseInt(next());
        String s = next();
        int best = 0;
        for (char c = 'a'; c <= 'z'; c++){
            int left = 0;
            int other = 0;
            for (int right = 0; right < s.length(); right++){
                if (s.charAt(right) != c) other++;
                while (other > k){
                    if (s.charAt(left) != c){
                        other--;
                    }
                    left++;
                }
                best = Math.max(best,right-left+1);
            }

        }
        writer.write(best + "\n");
        writer.flush();
        reader.close();
        writer.close();
    }
}