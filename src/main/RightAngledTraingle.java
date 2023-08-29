package main;

public class RightAngledTraingle {

    public static void main(String[] args) {
        // define the number of rows
        int rows = 50;
        for(int i=1; i<=rows; i++) {
            for(int j=1;j<=i; j++) {
                System.out.printf("* ");
            }
            System.out.println("");
        }
    }
}
