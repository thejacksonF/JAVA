class Solution(object):
    def majorityElement(self, nums):
        nums.sort()
        n = len(nums)
        for Posible_MajorityElement in nums:
            count = 0
            for num in nums:
                if num == Posible_MajorityElement:
                    count += 1
            if count > n // 2:
                return Posible_MajorityElement

if __name__ == "__main__":
    ValorDelUsuario = input("Dame varios numeros, pero espaciados (Ejemplo: 2 3 8): ")
    nums = list(map(int, ValorDelUsuario.strip().split()))
    VotS = Solution()
    resultado = VotS.majorityElement(nums)
    print("EL MAJORITY ELEMENTE ES:", resultado)