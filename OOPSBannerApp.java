/**
 * OOPSBannerApp
 *
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * @author MUNI KOUSHIK REDDY AVALA
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create String array to hold banner lines
        String[] bannerLines = new String[7];

        // Step 2: Populate array using String.join()

        bannerLines[0] = String.join(" ",
                " *****  ",
                " *****  ",
                "******* ",
                "******* "
        );

        bannerLines[1] = String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "
        );

        bannerLines[2] = String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "
        );

        bannerLines[3] = String.join(" ",
                "*     * ",
                "*     * ",
                "******* ",
                " *****  "
        );

        bannerLines[4] = String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "      * "
        );

        bannerLines[5] = String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "      * "
        );

        bannerLines[6] = String.join(" ",
                " *****  ",
                " *****  ",
                "*       ",
                " *****  "
        );

        // Step 3: Use enhanced for loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}