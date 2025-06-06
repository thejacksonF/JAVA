class Solution:
    def isPalindromo(self, s: str) -> bool:
        left, right = 0, len(s) - 1
        while left < right:
            if not s[left].isalnum():
                left += 1
                continue
            if not s[right].isalnum():
                right -= 1
                continue
            if s[left].lower() != s[right].lower():
                return False
            left += 1
            right -= 1
        return True

Statement = "Simon Pedro es mi apostol fav"
Statement_Two="A Santa lived as a devil at NASA"
VotS = Solution()
print(VotS.isPalindromo(Statement))
print(VotS.isPalindromo(Statement_Two))