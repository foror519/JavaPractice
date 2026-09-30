import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    static StringTokenizer st = null;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = in.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    private static void printSet(Set<Integer> set) {
        out.println(set.size());
        for (int x : set) {
            out.print(x + " ");
        }
        out.println();
    }

    public static void main(String[] args) throws IOException {
        String tokenN = next();
        if (tokenN == null) return;

        int n = Integer.parseInt(tokenN);
        int m = Integer.parseInt(next());

        Set<Integer> anya = new TreeSet<>();
        Set<Integer> borya = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            anya.add(Integer.parseInt(next()));
        }
        for (int i = 0; i < m; i++) {
            borya.add(Integer.parseInt(next()));
        }

        Set<Integer> common = new TreeSet<>();
        Set<Integer> anya_unique = new TreeSet<>();
        Set<Integer> borya_unique = new TreeSet<>();

        for (int x : anya) {
            if (borya.contains(x)) {
                common.add(x);
            } else {
                anya_unique.add(x);
            }
        }

        for (int x : borya) {
            if (!anya.contains(x)) {
                borya_unique.add(x);
            }
        }

        printSet(common);
        printSet(anya_unique);
        printSet(borya_unique);

        out.flush();
    }
}