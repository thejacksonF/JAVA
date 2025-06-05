class Solution(object):
    def moveZeroes(self, nums):
        contador_de_ceros = 0

        while 0 in list(nums):
            index = -1
            for i in range(len(nums)):
                if nums[i] == 0:
                    index = i
                    break
            if index != -1:
                nums.pop(index) #pop es pa recorrer pa todos los elementos
                contador_de_ceros += 1
        agrupacion_de_ceros = []
        for _ in range(contador_de_ceros):
            agrupacion_de_ceros.append(0)

        for cero in agrupacion_de_ceros:
            nums += [cero]

if __name__ == "__main__":
    ValorDelUsuario = input("Dame varios numeros, pero espaciados (Ejemplo: 2 3 8): ")
    nums = list(map(int, ValorDelUsuario.strip().split()))
    VotS = Solution()
    VotS.moveZeroes(nums)
    print("Nuevo orden con los ceros recorridos:", nums)