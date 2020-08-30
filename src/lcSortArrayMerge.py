class Solution(object):
    def sortArray(self, nums):
        if len(nums) <= 1: return nums
        left, right = self.sortArray(nums[:len(nums)//2]), self.sortArray(nums[len(nums)//2:])
        return merge(left,right)
        
    
    def merge(a, b):
        c = []
        a_idx, b_idx = 0,0
        while a_idx<len(a) and b_idx<len(b):
            if(a[a_idx] < b[b_idx]):
                c.append(a[a_idx])
                a_idx += 1
            else:
                c.append(b[b_idx])
                b_idx += 1
        if a_idx == len(a): c.extend(b[b_idx:])
        else: c.extend(a[a_idx:])
        return c

 
        