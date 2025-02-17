

public class MultidimensionalArray {
    public void printbidimensionalArray(){
        int [][] matrix = {
            {1,2,8,7,5,5,5,3},
            {3,4,999,77}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("longitud de la fila " + matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {    // este ciclo brinca en vertical
                System.out.print(matrix[i][j] + " ");       //
            }
            System.out.println();
        }
    }
}
