public class PRINCIPALJAVA2 {
    public static void main(String[] args) {

        InsertionDESK objInsertionSort = new InsertionDESK();
        int operaciones = objInsertionSort.insertionSort(objInsertionSort.arrayWorstInsertionCase);
        System.out.println("operaciones de insertion :O --> " + operaciones);

        BubbleDESK objBubbleSort = new BubbleDESK();
        int bubbleWorst = objBubbleSort.bubbleSort(objBubbleSort.arrayWorstBubbleCase);
        System.out.println("comparaciones de bubble :D --> " + bubbleWorst);

        SelectionDESK objSelectionSort = new SelectionDESK();
        int operacioneSelection = objSelectionSort.selectionSort(objSelectionSort.arrayWorstSelectionCase);
        System.out.println("operaciones de selection :) --> " + operacioneSelection);


        for (int i = 0; i < objSelectionSort.arrayWorstSelectionCase.length; i++) {
            System.out.print(objSelectionSort.arrayWorstSelectionCase[i] + " ");
        }

        for (int i = 0; i < objInsertionSort.arrayWorstInsertionCase.length; i++) {
            System.out.print(objInsertionSort.arrayWorstInsertionCase[i] + " ");
        }
 
    }
}
