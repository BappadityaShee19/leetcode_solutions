class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        ls = []
        nums_set = set(nums)
        nums.sort()
        for i in range(1,len(nums)+1):
            if i not in nums_set:
                ls.append(i)
        return ls