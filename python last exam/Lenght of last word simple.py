class Solution(object):
    def lengthOfLastWordSimple(self, s):
        oracion= s.strip()
        if not oracion:
            return 0
        palabras_de_ejemplo = oracion.split()
        return len(palabras_de_ejemplo[-1])

if __name__ == "__main__":
    VotS = Solution()
    print(VotS.lengthOfLastWordSimple("Hola profe, le hablo desde colab"))
    print(VotS.lengthOfLastWordSimple("Tiene que ver Mision Imposible, muy buena"))
    print(VotS.lengthOfLastWordSimple("Quiero comer un rib eye después de examenes"))

#Este problema fue sacado de LeetCode, siendo más especificamente el número #58