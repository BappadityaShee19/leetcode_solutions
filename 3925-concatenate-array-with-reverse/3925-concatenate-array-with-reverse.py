class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        nums2 = nums[::-1]
        return (nums+nums2)