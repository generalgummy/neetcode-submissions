class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if we've already seen the number needed to reach target
            if (seenNumbers.containsKey(complement)) {
                return new int[] { seenNumbers.get(complement), i };
            }

            // Otherwise, store the current number and its index for future checks
            seenNumbers.put(nums[i], i);
        }

        // Return empty array if no solution exists
        return new int[] {};
    }
}

