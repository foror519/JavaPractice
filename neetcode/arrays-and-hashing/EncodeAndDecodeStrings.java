package Neetcode;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        EncodeAndDecodeStringsSolution solution = new EncodeAndDecodeStringsSolution();
        System.out.println(solution.encode(List.of("Hello", "World")));
        System.out.println(solution.decode("5#Hello5#World"));
        System.out.println(solution.encode(List.of("")));
        System.out.println(solution.decode("0#"));
        System.out.println(solution.encode(List.of("1#")));
        System.out.println(solution.decode("2#1#"));

    }
}
class EncodeAndDecodeStringsSolution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int separator = str.indexOf('#', i);
            int length = Integer.parseInt(
                    str.substring(i, separator)
            );
            int start = separator + 1;
            int end = start + length;
            result.add(str.substring(start, end));
            i = end;
        }
        return result;
    }
}
