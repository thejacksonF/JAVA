public class Matrix {
        public void CalculateMatrix() {
            double[][] matrix = {
                {1.5, 2.0, 3.5},
                {4.0, 5.5, 6.1},
                {7.2, 8.3, 9.0}
            };
            
            double totalSum = 0.0;
    
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    totalSum += matrix[i][j];
                }
            }
            
            System.out.printf("La suma es: %.2f%n", totalSum);
        }
    }
    


//Define un arreglo unidimensional de tipo String con tamaño de en 5 elementos lenguaje Java



