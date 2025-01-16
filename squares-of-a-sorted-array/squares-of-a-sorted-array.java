class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int n=0;n<nums.length;n++){
            nums[n] =(int) Math.pow(Math.abs(nums[n]),2);
           
        }
        Arrays.sort(nums);
       return  nums;
    }
}    
