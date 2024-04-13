import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
            for (int i = 0; i < el.length(); i += minLength) {
                int endIndex = Math.min(i + minLength, el.length());
                sb.append(el.substring(i, endIndex));
            }
        }
        return sb.toString();
    }
}
