import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.StringTokenizer;

public class Main{
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static String next() throws IOException{
        while (st == null || !st.hasMoreTokens()){
            String line = in.readLine();
            if (line == null) return null;
            else st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
    public static String getSynonym(Map<String, String> map, String word) {
        if (map.containsKey(word)) {
            return map.get(word);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (word.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(next());
        Map <String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            String s1 = next();
            String s2 = next();
            map.put(s1,s2);
        }
        String find = next();
        System.out.println(getSynonym(map,find));

    }
}