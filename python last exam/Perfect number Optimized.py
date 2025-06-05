class Solution(object):
    def checkPerfectNumber(self, num):
        if num <= 1:
            return False
        REP = 1
        i = 2
        while i * i <= num:
            if num % i == 0:
                REP += i
                if i != num // i:
                    REP += num // i
            i += 1

        return REP == num

if __name__ == "__main__":
    ValorDelUsuario = int(input("Dame un numero: "))
    VotS = Solution() #vots es Variable of the Solution, me gusta ponerle nombres fancys
    resultado = VotS.checkPerfectNumber(ValorDelUsuario)
    print("¿Será verdadero (perfecto) o falso(no perfecto)?,pues es...", resultado)