class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            try {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            
            }
        }

        return false;
    }
}