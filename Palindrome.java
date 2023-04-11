import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        int rem =0;
        int temp = n;
        while(n>0){
            rem=n%10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        System.out.println(ans == temp ? "Palindrome" : "Not a palindrome");
    }
}
