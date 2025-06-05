class Solution(object):
    def checkPerfectNumber(self, num):
        if num <= 1:
            return False

        suma_total = 0
        for i in range(1, num):
            if num % i == 0:
                suma_total += i

        return suma_total == num

if __name__ == "__main__":
    ValorDelUsuario = int(input("Dame un numero: "))
    VotS = Solution()
    resultado = VotS.checkPerfectNumber(ValorDelUsuario)
    print("¿Será verdadero o falso?,pues es...", resultado)