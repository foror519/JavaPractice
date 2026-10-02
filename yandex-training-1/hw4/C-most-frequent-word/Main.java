import java.io.*;
import java.util.*;

public class Main{
static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

static String next() throws IOException{
    while (st == null || !st.hasMoreTokens()){
        String line = in.readLine();
        if (line == null) return null;
        st = new StringTokenizer(line);
    }
    return st.nextToken();
}

public static void main(String[] args) throws IOException{
    Map<String,Integer> map = new HashMap<>();
    String s = next();
    while(s != null){
        map.put(s, map.getOrDefault(s, 0) + 1);
        s = next();
    }
    int curMax = 0;
    for (Map.Entry<String,Integer> entry : map.entrySet()){
        if (entry.getValue() > curMax){
            curMax = entry.getValue();
        }
    }
    List<String> list = new ArrayList<>();
    for (Map.Entry<String,Integer> entry : map.entrySet()){
        if (entry.getValue() == curMax){
            list.add(entry.getKey());
        }
    }
    Collections.sort(list);
    out.write(list.get(0));
    out.flush();
}
}