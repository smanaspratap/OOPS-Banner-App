import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println("OOPS");
        System.out.println();

        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }

    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        return map;
    }

    private static void renderBanner(String message, Map<Character, String[]> map) {
        String text = message.toUpperCase();
        int height = 7;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                String[] pattern = map.get(ch);

                if (pattern == null) {
                    throw new IllegalArgumentException("No pattern found for: " + ch);
                }

                line.append(pattern[row]).append(" ");
            }
            System.out.println(line.toString());
        }
    }
}