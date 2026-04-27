package skillfactory;

import java.util.List;

public class Task6 {
    public static String joinStrings(List<String> strings, String delimiter) {
        if (strings == null) {
            return "";
        }

        if (strings.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strings.size(); i++) {
            result.append(strings.get(i));

            if (i < strings.size() - 1) {
                result.append(delimiter);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(joinStrings(List.of("java", "go", "python"), "&"));
    }
}
