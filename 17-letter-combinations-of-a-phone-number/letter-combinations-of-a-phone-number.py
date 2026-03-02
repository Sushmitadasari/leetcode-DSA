class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if not digits:
            return []
        phone = {
        '2': 'abc',
        '3': 'def',
        '4': 'ghi',
        '5': 'jkl',
        '6': 'mno',
        '7': 'pqrs',
        '8': 'tuv',
        '9': 'wxyz'}
        result = [""]   
        for digit in digits:          
            temp = []                 
            letters = phone[digit]    
            for combination in result:
                for letter in letters:
                    temp.append(combination + letter)
                result = temp        
        return result
        
        