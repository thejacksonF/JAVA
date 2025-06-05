class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)
        suma_soñada = n * (n + 1) // 2
        suma_verdadera = sum(nums)
        return suma_soñada - suma_verdadera

if __name__ == "__main__":
    ValorDelUsuario = input("Dame varios numeros, pero espaciados (Ejemplo: 2 3 8): ")
    nums = list(map(int, ValorDelUsuario.strip().split()))
    VotS = Solution()
    resultado = VotS.missingNumber(nums)
    print("El numero que falta es...", resultado)