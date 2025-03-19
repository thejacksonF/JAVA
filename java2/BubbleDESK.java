public class BubbleDESK{ 

        int[] arrayWorstBubbleCase = {5, 4, 3, 2, 1};
        public int bubbleSort(int[] arr) {
            int n = arr.length;
            int comparisons = 0; 
        
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    comparisons++; 
                    if (arr[j] > arr[j + 1]) {
                        // Intercambio
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return comparisons;
        }
        
    }
    

