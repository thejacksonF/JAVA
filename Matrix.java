public class Matrix {
        public void CalculateMatrix() {
            double[][] matriz = {
                {1.5, 2.0, 3.5},
                {4.0, 5.5, 6.1},
                {7.2, 8.3, 9.0}
            };
            
            double sumaTotal = 0.0;
    
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    sumaTotal += matriz[i][j];
                }
            }
            
            System.out.printf("La suma de todos los valores en el arreglo es: %.2f%n", sumaTotal);
        }
    }
    



