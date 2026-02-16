public class OOPSBanner {
    public static void main(String[] args) {
        // UC4: Store lines in a String Array to eliminate repetitive code
        String[] banner = new String[7];

        banner[0] = String.join("","  ***** " , "   ***** " , "  ***** " , "  ***** ");
        banner[1] = String.join(""," *     * " , " *     * " , " *    * " , " *     ");
        banner[2] = String.join(""," *     * "  ," *     * " , " *    * " , " *      ");
        banner[3] = String.join(""," *     * "  ," *     * " , " ***** " , "  ***** ");
        banner[4] = String.join(""," *     * " , " *     * " , " * " , "          * ");
        banner[5] = String.join(""," *     * " , " *     * " , " * " , "          * ");
        banner[6] = String.join("","  ***** " , "   *****  "  , " * " , "      ***** ");
        for (String line : banner) {
            System.out.println(line);
        }
    }
}