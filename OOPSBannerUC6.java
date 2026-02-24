public class OOPSBanner {
    public static void main(String[] args) {
        // UC6: Build the banner using modular method calls
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = getLine(i);
        }

        // Print the final result
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper to assemble one full row of the OOPS banner
    public static String getLine(int row) {
        return String.join("", getO(row), getO(row), getP(row), getS(row));
    }

    // Static method for letter O
    public static String getO(int row) {
        String[] patterns = {"  ***** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  ***** "};
        return patterns[row];
    }

    // Static method for letter P
    public static String getP(int row) {
        String[] patterns = {"  ***** ", " * * ", " * * ", "  ***** ", " * ", " * ", " * "};
        return patterns[row];
    }

    // Static method for letter S
    public static String getS(int row) {
        String[] patterns = {"  ***** ", " * ", " * ", "  ***** ", "       * ", "       * ", "  ***** "};
        return patterns[row];
    }
}