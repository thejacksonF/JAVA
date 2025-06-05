package JAVA.java2;


public class SelectionDESK {
    int arrayWorstSelectionCase[] = {5,4,3,2,1};
    public int selectionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return comparisons;
    }
}
