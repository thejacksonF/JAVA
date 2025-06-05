class Solution:
    def isPalindrome(self, s: str) -> bool:
        filtered = ''.join(c.lower() for c in s if c.isalnum())
        return filtered == filtered[::-1]

Statement = "Simon Pedro es mi apostol fav"
VotS = Solution()
print(VotS.isPalindrome(Statement))