class Solution {
    public int findNumbers(int[] nums) {
        int res, rem;
        int even = 0;
        for(int i=0; i<nums.length; i++){
            int count =0;
            res = nums[i];
            while(res>0){
                rem = res % 10;
                res /= 10;
                count++;
            }
            if(count % 2 ==0){
                even++;
            }
        }
        return even;
    }
}
