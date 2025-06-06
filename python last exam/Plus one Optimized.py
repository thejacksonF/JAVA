class Solution(object):
    def plusOne(self, digits):
        numero_real = 0
        for digit in digits:
            numero_real = numero_real * 10 + digit

        numero_real += 1

        return [int(d) for d in str(numero_real)]

VotS = Solution()
print(VotS.plusOne([8, 2, 3]))
print(VotS.plusOne([88, 45, 32]))
print(VotS.plusOne([9, 3, 5]))