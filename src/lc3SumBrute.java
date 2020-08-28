class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ArrayList<Integer> nums2 = new ArrayList<Integer>();
                        nums2.add(nums[i]);
                        nums2.add(nums[j]);
                        nums2.add(nums[k]);
                        if(!list.contains(nums2)) list.add(nums2);
                    }
                }
            }
        }
        return list;
    }
}