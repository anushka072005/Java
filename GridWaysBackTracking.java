public class GridWaysBackTracking {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if(i == n-1 && j == m-1) { //cond for last cell
            return 1;
        }
        else if(i == n || j == m) { // boundry cross cond
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }

    public static int optimizeFormula(int i, int j, int n, int m) {
        return ()
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        // System.out.println("Total number of Ways are for " + n + "x" + m  + " = " + gridWays(0, 0, n, m));
    }
}
