import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line1 = br.readLine();
        if (line1 == null || line1.isEmpty()) return;

        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st1 = new StringTokenizer(line1);
        while (st1.hasMoreTokens()) {
            set.add(Integer.parseInt(st1.nextToken()));
        }

        String line2 = br.readLine();
        if (line2 == null || line2.isEmpty()) return;

        ArrayList<Integer> result = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(line2);
        while (st2.hasMoreTokens()) {
            int val = Integer.parseInt(st2.nextToken());
            if (set.remove(val)) {
                result.add(val);
            }
        }

        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            out.print(result.get(i));
            if (i + 1 < result.size()) {
                out.print(" ");
            }
        }
        out.println();
        out.flush();
    }
}