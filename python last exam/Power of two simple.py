class Solution(object):
    def isPowerOfTwo(self, n):
        if n <= 0:
            return False
        potencia = 1
        while potencia < n:
            potencia *= 2
        return potencia == n

if __name__ == "__main__":
    ValorDelUsuario= int(input("Dame un numero: "))
    VotS = Solution()
    resultado = VotS.isPowerOfTwo(ValorDelUsuario)
    print("¿Será acaso, potencia de dos?", resultado)