public class OOPSBanner {
    public static void main(String[] args) {
        // UC4: Store lines in a String Array to eliminate repetitive code
        String[] banner = {

        String.join("","  ***** " , "   ***** " , "  ***** " , "  ***** "),
        String.join(""," *     * " , " *     * " , " *    * " , " *     "),
        String.join(""," *     * "  ," *     * " , " *    * " , " *      "),
        String.join(""," *     * "  ," *     * " , " ***** " , "  ***** "),
        String.join(""," *     * " , " *     * " , " * " , "          * "),
        String.join(""," *     * " , " *     * " , " * " , "          * "),
        String.join("","  ***** " , "   *****  "  , " * " , "      ***** ")
};

        for (String line : banner) {
            System.out.println(line);
        }
    }
}