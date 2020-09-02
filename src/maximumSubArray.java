class Solution {
    public int maxSubArray(int[] nums) {
        int localSolution = nums[0]; 
        int solution = nums[0]; 
        for(int i = 1; i < nums.length; i++){
            localSolution = Math.max(nums[i], localSolution + nums[i]);
            solution = Math.max(solution, localSolution);
        }
        return solution; 
    }
}