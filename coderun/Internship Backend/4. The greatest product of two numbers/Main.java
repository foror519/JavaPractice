import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int [] a = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++){
            if (a[i] >= max1){
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] >= max2){
                max2 = a[i];
            }
            if (a[i] <= min1){
                min2 = min1;
                min1 = a[i];
            }
            else if (a[i] <= min2){
                min2 = a[i];
            }
        }
        if ((long)min1 * min2 > (long)max1 * max2) System.out.println(min1 + " " + min2);
        else System.out.println(max2 + " " + max1);
    }
}