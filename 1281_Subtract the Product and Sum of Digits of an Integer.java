class Solution {
    public int subtractProductAndSum(int n) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number:");
        int product = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            product = product * rem;
            sum = sum + rem;
            n=n/10;
        }
        int result = product - sum;
        System.out.println("Product of Number: " + product);
        System.out.println("Sum of Number: " + sum);

        System.out.println(result);
        return result;
    }
}        
    
