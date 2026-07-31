class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        counts = Counter(nums)
        th = len(nums)//3
        return [num for num, count in counts.items() if count> th]