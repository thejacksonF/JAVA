class Solution(object):
    def plusOne(self, digits):
        numero_real = 0
        for digit in digits:
            numero_real = numero_real * 10 + digit

        numero_real += 1

        return [int(d) for d in str(numero_real)]

VotS = Solution()
print(VotS.plusOne([88, 25, 32]))
print(VotS.plusOne([23, 35, 72, 51]))
print(VotS.plusOne([9]))