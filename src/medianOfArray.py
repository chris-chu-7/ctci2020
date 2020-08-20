class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        finalArray = []
        i = 0
        firstPointer = 0
        secondPointer = 0
        while i < len(nums1) + len(nums2):
            while(firstPointer < len(nums1) and secondPointer < len(nums2)):
                if(nums1[firstPointer] <= nums2[secondPointer]):
                    finalArray.append(nums1[firstPointer])
                    firstPointer = firstPointer + 1
                else:
                    finalArray.append(nums2[secondPointer])
                    secondPointer = secondPointer + 1
            while(firstPointer < len(nums1)):
                finalArray.append(nums1[firstPointer])
                firstPointer = firstPointer + 1
            while(secondPointer < len(nums2)):
                finalArray.append(nums2[secondPointer])
                secondPointer = secondPointer + 1
            i = i + 1
        oddOrEven = len(finalArray) % 2 == 1
        if oddOrEven:
            return finalArray[int(len(finalArray) / 2)]
        else:
            return (finalArray[int(len(finalArray) / 2)] +  finalArray[int(len(finalArray) / 2) - 1]) / 2