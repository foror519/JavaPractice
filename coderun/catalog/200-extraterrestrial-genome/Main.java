import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
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
    public static void main(String[] args) throws IOException {
        String first = next();
        String second = next();
        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for (int i = 0; i < firstCharArray.length-1; i++){
            map1.put(new String(firstCharArray[i]+""+firstCharArray[i+1]),map1.getOrDefault(new String(firstCharArray[i]+""+firstCharArray[i+1]),0)+1);
        }
        for (int i = 0; i < secondCharArray.length-1; i++){
            map2.put(new String(secondCharArray[i]+""+secondCharArray[i+1]),map2.getOrDefault(new String(secondCharArray[i]+""+secondCharArray[i+1]),0)+1);
        }
        int ans = 0;
        for (String pair: map1.keySet()){
            if (map2.containsKey(pair)){
                ans += map1.get(pair);
            }
        }
        out.write(Integer.toString(ans));
        out.newLine();

        in.close();
        out.close();
    }
}