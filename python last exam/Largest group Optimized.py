from collections import Counter

class Solution(object):
    def countLargestGroup(self, ValorDelUsuario):
        contador2 = Counter()

        for i in range(1, ValorDelUsuario + 1):
            suma = 0
            temp = i
            while temp > 0:
                suma += temp % 10
                temp //= 10
            contador2[suma] += 1

        grupo_maximo = max(contador2.values())
        return sum(1 for v in contador2.values() if v == grupo_maximo)

if __name__ == "__main__":
    ValorDelUsuario= int(input("Dame un valor "))
    VotS = Solution()
    resultado = VotS.countLargestGroup(ValorDelUsuario)
    print("Grupo de mayor tamaño es:", resultado)