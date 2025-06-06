class Solution:
    def isPalindrome(self, oracion: str) -> bool:
        filtered = ''.join(letra_individual.lower() for letra_individual in oracion if letra_individual.isalnum())
        return filtered == filtered[::-1]

Statement = "Simon Pedro es mi apostol fav"
VotS = Solution()
print(VotS.isPalindrome(Statement))