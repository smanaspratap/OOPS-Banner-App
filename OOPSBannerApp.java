public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println("OOPS");
        System.out.println();

        String[] banner = {
                String.join("", "  *****  ", "   *****  ", " ******  ", "  *****  "),
                String.join("", " *     * ", "  *     * ", " *     * ", " *       "),
                String.join("", " *     * ", "  *     * ", " *     * ", " *       "),
                String.join("", " *     * ", "  *     * ", " ******  ", "  *****  "),
                String.join("", " *     * ", "  *     * ", " *       ", "       * "),
                String.join("", " *     * ", "  *     * ", " *       ", "       * "),
                String.join("", "  *****  ", "   *****  ", " *       ", "  *****  ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}