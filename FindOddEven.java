import java.util.Scanner;

public class FindOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value Of N = ");
        int n = sc.nextInt();

        if ( n % 2 == 0){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is Odd");
        }
        sc.close();
    }
}
