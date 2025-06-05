class Solution(object):
    def lengthOfLastWord(self, s):
        i = len(s) - 1
        length = 0

        while i >= 0 and s[i] == ' ':
            i -= 1

        while i >= 0 and s[i] != ' ':
            length += 1
            i -= 1

        return length

if __name__ == "__main__":
    VotS = Solution()
    print(VotS.lengthOfLastWord("Hola profe, le hablo desde colab"))                
    print(VotS.lengthOfLastWord("Tiene que ver Mision Imposible, muy buena")) 
    print(VotS.lengthOfLastWord("Quiero comer un rib eye después de examenes"))    