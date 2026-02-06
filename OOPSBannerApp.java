
public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println("OOPS");
        System.out.println();

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("", o[i], " ", o[i], " ", p[i], " ", s[i]));
        }
    }

    private static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    private static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    private static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }
}
