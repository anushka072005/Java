public class TilingProblem {
    public static int tilingProblem(int n) {
        //base case
        if(n==0 || n==1) {
            return 1;
        }

        // work
        //Vertical choice
        int fnm1 = tilingProblem(n-1);

        //Horizoltal choice
        int fnm2 = tilingProblem(n-2);

        //Total ways
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
