import java.util.Scanner;

public class FirstLeetCodeProb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number:");
        int n = in.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            product *= rem; //reduce the time complexity as much as poosible
            sum += rem;
            n /= 10;
        }
        int result = product - sum;
        System.out.println("Product of Number: " + product);
        System.out.println("Sum of Number: " + sum);

        System.out.println(result);
    }
}
