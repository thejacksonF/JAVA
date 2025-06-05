class Solution(object):
    def countLargestGroup(self, ValorDelUsuario):
        grupos = {}

        for i in range(1, ValorDelUsuario + 1):
            suma_digitos = sum(map(int, str(i)))
            if suma_digitos not in grupos:
                grupos[suma_digitos] = [i]
            else:
                grupos[suma_digitos].append(i)

        max_tamaño = 0
        contador = 0

        for clave in grupos:
            tam = len(grupos[clave])
            if tam > max_tamaño:
                max_tamaño = tam
                contador = 1
            elif tam == max_tamaño:
                contador += 1

        return contador

if __name__ == "__main__":
    ValorDelUsuario = int(input("Dame un valor: "))
    VotS = Solution()
    resultado = VotS.countLargestGroup(ValorDelUsuario)
    print("Grupo de mayor tamaño es :", resultado)