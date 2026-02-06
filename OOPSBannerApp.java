public class OOPSBannerApp {

    /**
     * Inner static class to store a character and its banner pattern.
     */
    private static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character the character
         * @param pattern   the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return the banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        System.out.println("OOPS");
        System.out.println();

        CharacterPatternMap o = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap p = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap s = new CharacterPatternMap('S', getSPattern());

        CharacterPatternMap[] patterns = { o, p, s };

        StringBuilder sb = new StringBuilder();
        String message = "OOPS";

        for (int row = 0; row < 7; row++) {
            sb.setLength(0);

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);

                if (ch == 'O') sb.append(o.getPattern()[row]).append(" ");
                else if (ch == 'P') sb.append(p.getPattern()[row]).append(" ");
                else if (ch == 'S') sb.append(s.getPattern()[row]).append(" ");
            }

            System.out.println(sb.toString());
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