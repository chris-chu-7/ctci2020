class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        left = 0
        right = len(height) - 1
        min = 0
        while(left < right):
            if(height[left] < height[right]):
                min = height[left]
            else: 
                min = height[right]
            area = min * (right - left)
            if maxArea < area:
                maxArea = area
            if height[left] < height[right]:
                left = left + 1
            else:
                right = right - 1
        return maxArea