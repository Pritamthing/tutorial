package main;

public class Pattern1 {

    public static void main(String[] args) {
        // number of rows
        int rows =15;
        for(int i=rows; i>=1;i--) {
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.println("");
        }
    }
}
