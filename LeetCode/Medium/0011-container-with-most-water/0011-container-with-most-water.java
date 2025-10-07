class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWidth = 0;
        while(left < right) {
            int high = Math.min(height[left], height[right]);
            maxWidth = Math.max(maxWidth, (right - left) * high);

            if(height[left] > height[right]) {
                right -= 1;
            } else {
                left += 1;
            }
        }

        return maxWidth;
    }
}