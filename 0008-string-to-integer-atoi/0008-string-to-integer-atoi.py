class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()  # Step 1: Remove leading/trailing whitespaces
        if not s:
            return 0
        
        sign = 1
        index = 0
        
        # Step 2: Check sign
        if s[0] == '-':
            sign = -1
            index += 1
        elif s[0] == '+':
            index += 1
            
        result = 0
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        
        # Step 3: Read digits
        while index < len(s) and s[index].isdigit():
            digit = int(s[index])
            result = result * 10 + digit
            index += 1
            
        # Apply sign
        result *= sign
        
        # Step 4: Rounding (32-bit signed integer range bounds)
        if result < INT_MIN:
            return INT_MIN
        if result > INT_MAX:
            return INT_MAX
            
        return result