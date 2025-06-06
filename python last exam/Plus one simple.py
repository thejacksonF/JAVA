class Solution(object):
    def plusOne(self, digits):
        num_empty = ""
        for digit in digits:
            num_empty += str(digit)

        numero_real = int(num_empty) + 1

        resultado = []
        for ch in str(numero_real):
            resultado.append(int(ch))

        return resultado

VotS= Solution()
print(VotS.plusOne([120, 9, 57, 303]))
print(VotS.plusOne([1, 2, 3]))
print(VotS.plusOne([10]))