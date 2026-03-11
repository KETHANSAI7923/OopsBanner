public class OopsBannerApp {

    public static void main(String[] args) {
        displayBanner();
    }

    public static void displayBanner() {

        String[] bannerLines = {

            String.join("", "  *****          *****          *******         ******* "),
            String.join("", "*       *      *       *       *        *      *         "),
            String.join("", "*       *      *       *       *        *      *         "),
            String.join("", "*       *      *       *       *******          *******"),
            String.join("", "*       *      *       *       *                        *"),
            String.join("", "*       *      *       *       *                        *"),
            String.join("", "  *****          *****         *                *******")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}