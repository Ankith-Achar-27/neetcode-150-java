package ArraysHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode271 {

    public static void main(String[] args) {

        List<String> strs = List.of("hello", "world");

        String encoded = encode(strs);

        System.out.println("Original: " + strs);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decode(encoded));
    }

    // Encode
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("~").append(str);
        }
        return sb.toString();
    }

    // Decode
    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '~') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i,j));
            i = j + 1;
            result.add(s.substring(i,i+length));
            i+=length;
        }
        return result;
    }
}