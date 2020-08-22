class Solution(object):
    def convert(self, s, numRows):
        if(numRows == 1): return s
        list = []
        minimum = min(int(len(s)), numRows)
        for i in range(minimum):
            list.append("")
        curRow = 0
        goingDown = False
        for i in range(len(s)):
            list[curRow] = list[curRow] + s[i]
            if (curRow == 0 or curRow == numRows - 1): goingDown = not goingDown
            decision = -1
            if goingDown: decision = 1
            curRow = curRow + decision
        return ''.join(list)