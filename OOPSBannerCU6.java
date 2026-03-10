public class OOPSBanner {
    public static void main(String[] args) {
        // Step 2: In main method, call these methods to get the patterns
        // and store them in String arrays
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 3: Finally, use a loop to print each line of the banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }

    // Step 1: Define methods getOPattern(), getPPattern(), and getSPattern()
    // that return String arrays representing the ASCII art for each letter
    
    public static String[] getOPattern() {
        return new String[] {
            "   *** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "   *** "
        };
    }
    public static String[] getOPattern() {
        return new String[] {
            "   *** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "   *** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ****** ",
            " **    **",
            " **    **",
            " ****** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "   ***** ",
            " **      ",
            " ** ",
            "   *** ",
            "      ** ",
            "      ** ",
            " ***** "
        };
    }
}