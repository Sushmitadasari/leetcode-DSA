class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        map={
            ')' : '(',
            '}' : '{',
            ']' : '['
        }
        for ch in s:
            if ch in map:
                if not stack or stack[-1]!=map[ch]:
                    return False
                stack.pop()
            else:
                stack.append(ch)

        return len(stack)==0
        