// /https://leetcode.com/problems/power-of-four/submissions/1237470784/
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0 ) return false;
        if(n == 1) return true;
        if((n % 4) != 0) return false;
        else{
            return isPowerOfFour(n/4);}
    }
}
