class Solution(object):
    def plusOne(self, digits):
        num_empty = ""
        for digit in digits:
            num_empty += str(digit)

        numero_real = int(num_empty) + 1

        result = []
        for ch in str(numero_real):
            result.append(int(ch))

        return result

VotS= Solution()
print(VotS.plusOne([120, 9, 57, 303]))
print(VotS.plusOne([42, 3, 2, 1]))
print(VotS.plusOne([10]))