class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0;
        int sum = 0;
        while(x>0){
            rem = x%10;
            sum = sum*10 + rem;
            x /= 10;
        }
        if(sum == temp){
            return true;
        }
        else {
            return false;
        }
        
    }
}
