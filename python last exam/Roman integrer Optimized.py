class Solution(object):
    def romanToInt(self, s):
        Valores_de_las_letras = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        total = Valores_de_las_letras[s[-1]]
        for i in range(len(s) - 2, -1, -1):
            if Valores_de_las_letras[s[i]] < Valores_de_las_letras[s[i + 1]]:
                total -= Valores_de_las_letras[s[i]]
            else:
                total += Valores_de_las_letras[s[i]]

        return total

VotS = Solution()
print(VotS.romanToInt("CXX")) #Numero de un soldado
print(VotS.romanToInt("LXXVII"+"XLX"))   #numero especial
print(VotS.romanToInt("MCMLXXXVI")) #Año de la pelicula de TOP GUN MAVERICK