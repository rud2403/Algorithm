class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int size = nums.length;
        int answer = nuns[0] + nums[1] + nums[2];

        for(int i = 0; i < size - 2; i++) {
            int left = i + 1;
            int right = size - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int absX = Math.abs(target - sum);
                int absY = Math.abs(target - answer);

                answer = absX > absY ? answer : sum;

                if(target > sum) {
                    left++;
                } else if(target < sum) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return answer;
    }
}