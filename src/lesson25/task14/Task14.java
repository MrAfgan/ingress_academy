package lesson25.task14;

public class Task14 {
    static Formatter titleCaseFormatter = text -> {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            if (!s.isEmpty()) {
                sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    };

    public static void applyFormatter(String text, Formatter formatter) {
        System.out.println(formatter.format(text));
    }
}
