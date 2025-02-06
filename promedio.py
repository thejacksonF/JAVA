def promedio_calificaciones():
    valores = []
    while True:
        try:
            valor = int(input("Calificación: "))
            if valor == 0:
                break
            valores.append(valor)
        except ValueError:
            print("Inserta un número.")
    print("Promedio: ", sum(valores)/len(valores))

promedio_calificaciones()