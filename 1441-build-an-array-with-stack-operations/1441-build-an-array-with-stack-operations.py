class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        result = []
        current_num = 1
        
        for num in target:
            # Push and Pop for skipped numbers
            while current_num < num:
                result.append("Push")
                result.append("Pop")
                current_num += 1
            
            # Push the matching number
            result.append("Push")
            current_num += 1
            
        return result