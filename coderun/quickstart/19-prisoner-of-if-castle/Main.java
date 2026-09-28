import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(reader.readLine().trim());
        int b = Integer.parseInt(reader.readLine().trim());
        int c = Integer.parseInt(reader.readLine().trim());
        int d = Integer.parseInt(reader.readLine().trim());
        int e = Integer.parseInt(reader.readLine().trim());

        int[] array = new int[]{a, b, c};
        Arrays.sort(array);

        if ((array[0] <= d && array[1] <= e) || (array[0] <= e && array[1] <= d)) {
            writer.write("YES");
        } else {
            writer.write("NO");
        }

        reader.close();
        writer.close();
    }
}