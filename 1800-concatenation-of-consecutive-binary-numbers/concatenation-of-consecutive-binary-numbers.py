class Solution(object):
    def concatenatedBinary(self, n):
        s=''
        for i in range(1,n+1):
            s+=bin(i)[2:]
        return int(s,2)%((10**9)+7)