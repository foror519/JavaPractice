import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

	static String next() throws IOException{
    	while (st == null || !st.hasMoreTokens()){
    		String line = in.readLine();
        	if (line == null) return null;
        	else st = new StringTokenizer(line);
    	}
    	return st.nextToken();
	}
	public static void main(String[] args) throws IOException{
		Map <String, Integer> map = new HashMap<>();
    	String word;
    	while ((word = next()) != null){
        	int count = map.getOrDefault(word, 0);
        	out.write(count + " ");
        	map.put(word, count + 1);
        }
    	out.flush();
	}
}