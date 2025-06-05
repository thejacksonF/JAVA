class Solution(object):
    def isPowerOfTwo(self, n):
        return n > 0 and (n & (n - 1)) == 0

if __name__ == "__main__":
    ValorDelUsuario= int(input("Dame un número "))
    VotS = Solution()
    resultado = VotS.isPowerOfTwo(ValorDelUsuario)
    print("¿Será acaso, potencia de dos?", resultado)