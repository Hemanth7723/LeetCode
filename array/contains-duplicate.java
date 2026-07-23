class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> c = new HashSet<>(nums.length);
        for(int i=0;i<nums.length;i++){
            if (c.contains(nums[i])){
                return true;
            }
            c.add(nums[i]);
        }
        return false;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna