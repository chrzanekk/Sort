package pl.com.konrad.sort;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        QuickSort quickSort = new QuickSort();
        TimeDuration timeDuration = new TimeDuration();

        int[] unsortedList = {34, 13, 76, 1, 97, 61, 6, 93, 12, 32, 11, 88, 31, 84, 16, 19, 2, 66, 33, 82, 5, 43, 14, 101, 124, 4, 9, 20, 10, 99, 77};
        System.out.println("Unsorted list: ");
        printArray(unsortedList);

        long startTimeBubbleSort = System.nanoTime();
        int[] bubbleSorted = bubbleSort.bubbleSort(unsortedList);
        long endTimeBubbleSort = System.nanoTime();
        System.out.println("Sorted list by using \" bubble sort\": ");
        printArray(bubbleSorted);

        long startTimeInsertSort = System.nanoTime();
        int[] insertSorted = insertSort.insertSort(unsortedList);
        long endTimeInsertSort = System.nanoTime();
        System.out.println("Sorted list by using \" insert sort\": ");
        printArray(insertSorted);

        long startTimeQuickSort = System.nanoTime();
        int[] quickSorted = quickSort.quickSort(unsortedList, 0,unsortedList.length-1);
        long endTimeQuickSort = System.nanoTime();
        System.out.println("Sorted list by using \" quick sort\": ");
        printArray(quickSorted);

        System.out.println("Sorting time durations: ");
        System.out.println("1. Bubble sort: " + timeDuration.timeDuration(startTimeBubbleSort,endTimeBubbleSort) +
                "ms.");
        System.out.println("2. Insertion sort: " + timeDuration.timeDuration(startTimeInsertSort,endTimeInsertSort) + "ms" +
                ".");
        System.out.println("3. Quick sort: " + timeDuration.timeDuration(startTimeQuickSort,endTimeQuickSort) + "ms" +
                ".");

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
