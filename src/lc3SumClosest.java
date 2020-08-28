class Solution {
    public int threeSumClosest(int[] nums, int target) { 
        int closestSum = Integer.MAX_VALUE;
        int closestDifference = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            int sum = Integer.MAX_VALUE;
            int difference = Integer.MAX_VALUE;
            while(j < k && sum != target){
                sum = nums[i] + nums[j] + nums[k]; 
                difference = Math.abs(sum - target);
                if(difference < closestDifference) {
                    closestDifference = difference;
                    closestSum = sum;
                }
                if(sum == target) return target;
                else if(sum > target) k--;
                else if (sum < target) j++;
            }
        }
        return closestSum; 
    }
}