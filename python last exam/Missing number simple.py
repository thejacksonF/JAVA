class Solution(object):
    def missingNumber(self, nums):

        Valor_de_N = len(nums)
        total = Valor_de_N + 1

        i = 0
        while i < total:
            encontrado = False

            j = 0
            while j < len(nums):
                if nums[j] == i:
                    encontrado = True
                    break
                j += 1

            if not encontrado:
                return i

            i += 1

if __name__ == "__main__":
    ValorDelUsuario = input("Dame varios numeros, pero espaciados (Ejemplo: 2 3 8)")
    nums = list(map(int, ValorDelUsuario.strip().split()))
    VotS = Solution()
    resultado = VotS.missingNumber(nums)
    print("El numero que falta es...", resultado)