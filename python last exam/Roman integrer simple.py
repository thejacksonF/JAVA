class Solution(object):
    def CalcularValoresRomanos(self, valorEnTexto):
        Valores_de_las_letras = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }

        resultado  = 0
        i = 0
        while i < len(valorEnTexto):
            if i + 1 < len(valorEnTexto):
                LETTERS = valorEnTexto[i] + valorEnTexto[i + 1]
                if LETTERS == "IV":
                    resultado += 4
                    i += 2
                    continue
                elif LETTERS == "IX":
                    resultado += 9
                    i += 2
                    continue
                elif LETTERS == "XL":
                    resultado += 40
                    i += 2
                    continue
                elif LETTERS == "XC":
                    resultado += 90
                    i += 2
                    continue
                elif LETTERS == "CD":
                    resultado += 400
                    i += 2
                    continue
                elif LETTERS == "CM":
                    resultado += 900
                    i += 2
                    continue

            resultado += Valores_de_las_letras[valorEnTexto[i]]
            i += 1

        return resultado

VotS = Solution()
print(VotS.CalcularValoresRomanos("CXX")) #Numero de un soldado
print(VotS.CalcularValoresRomanos("LXXVII"+"XLX"))   #numero especial
        #Con este me acorde de mis primeros codigos todos mal hechos jeje