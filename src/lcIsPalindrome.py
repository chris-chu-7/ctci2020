class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0: return False
        if x < 10: return True
        number = x
        result = 0
        multiplier = 1
        while number > 0:
            mod =  (int)(number % multiplier / (multiplier / 10))
            result = result * 10 + mod
            number = number - number % multiplier
            multiplier = multiplier * 10
        return result == x