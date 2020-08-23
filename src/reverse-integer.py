class Solution:
    def reverse(self, x: int) -> int:
        result = 0
        isNegative = False
        if x < 0:
            isNegative = True
            x = x * -1
        while x != 0:
            tail = int(x) % 10
            newResult = int(result * 10 + tail)
            if (int((newResult - tail) / 10) != result): return 0
            result = newResult
            x = int(x / 10)
        if isNegative:
            result = result * -1
        return result