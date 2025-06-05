class Solution(object):
    def majorityElement(self, nums):
        el_contador = 0
        Un_Posible_MajorityElement = None
        for num in nums:
            if el_contador == 0:
                Un_Posible_MajorityElement = num
            el_contador += (1 if num == Un_Posible_MajorityElement else -1)
        return Un_Posible_MajorityElement

if __name__ == "__main__":
    ValorDelUsuario = input("Dame varios numeros, pero espaciados (Ejemplo: 2 3 8): ")
    nums = list(map(int, ValorDelUsuario.strip().split()))
    VotS = Solution()
    resultado = VotS.majorityElement(nums)
    print("EL MAJORITY ELEMENT ES:", resultado)