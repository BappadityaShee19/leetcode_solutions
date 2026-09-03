class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        candidates.sort()

        def backtrack(start: int, remain: int, path: List[int]):
            if(remain == 0):
                result.append(list(path))
                return
            for i in range(start, len(candidates)):
                if(candidates[i]>remain):
                    break
                if(i> start and candidates[i]== candidates[i-1]):
                    continue
                path.append(candidates[i])
                backtrack(i+1, remain - candidates[i], path)
                path.pop()
        backtrack(0, target, [])
        return result