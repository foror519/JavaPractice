import java.util.StringTokenizer;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

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
	
	public static void main(String[] args) throws IOException{
    	int x = Integer.parseInt(next());
    	int y = Integer.parseInt(next());
    	int z = Integer.parseInt(next());
    	int num = Integer.parseInt(next());
    
    	Set<Integer> buttons = new HashSet<>();
    	buttons.add(x);
    	buttons.add(y);
    	buttons.add(z);
    	int addedCount = 0;
    	
    	do{
        	int digit = num % 10;
        if (!buttons.contains(digit)){
        	addedCount++;
        	buttons.add(digit);
        }
        num /= 10;
        
		} while(num > 0);
    	System.out.println(addedCount);
		}
}