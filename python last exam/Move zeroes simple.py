class Solution(object):
    def moveZeroes(self, nums):
        contador_de_ceros = 0

        i = 0
        while i < len(nums):
            if nums[i] == 0:
                nums.remove(0)
                contador_de_ceros += 1
            else:
                i += 1


        for _ in range(contador_de_ceros):
            nums.append(0)

if __name__ == "__main__":
    ValorDelUsuario = input("Dame varios numeros, pero espaciados (Ejemplo: 2 3 8):")
    nums = list(map(int, ValorDelUsuario.strip().split()))
    VotS = Solution()
    VotS.moveZeroes(nums)
    print("cantidad de ceros recorridos:", nums)