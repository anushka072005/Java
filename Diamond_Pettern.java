public class Diamond_Pettern {

    public static void Diamond(int n) {
        //1st half
        //outerloop
        for(int i=1; i<=n; i++) {
            //innerloop
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond(4);
    }

    
}
