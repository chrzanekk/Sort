package pl.com.konrad.sort;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        QuickSort quickSort = new QuickSort();

        int[] unsortedList = {34, 13, 76, 1, 97, 61, 6, 93, 12, 32, 11, 88, 31, 84, 16, 19, 2, 66, 33, 82, 5, 43, 14, 101, 124, 4, 9, 20, 10, 99, 77};
        System.out.println("Unsorted list: ");
        printArray(unsortedList);

        int[] bubbleSorted = bubbleSort.bubbleSort(unsortedList);
        System.out.println("Sorted list by using \" bubble sort\": ");
        printArray(bubbleSorted);

        int[] insertSorted = insertSort.insertSort(unsortedList);
        System.out.println("Sorted list by using \" insert sort\": ");
        printArray(insertSorted);

        int[] quickSorted = quickSort.quickSort(unsortedList, 0,unsortedList.length-1);
        System.out.println("Sorted list by using \" quick sort\": ");
        printArray(quickSorted);
    }

    public static void printArray(int[] arrayToPrint) {
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(" " + arrayToPrint[i]);
        }
        System.out.print(" ]");
        System.out.println();
    }
}
