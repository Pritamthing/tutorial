class Pattern {
    public static void main(String[] args) {

        // right angle traingle in JAVA
        int rows = 100; // number of rows

        for (int i = 1; i <= rows; i++) {
            // print the spaces before astrics
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // print the astrics
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // print the new line
            System.out.println();
        }
    }
}