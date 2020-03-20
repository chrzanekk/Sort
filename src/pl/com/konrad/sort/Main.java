package pl.com.konrad.sort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        QuickSort quickSort = new QuickSort();
        TimeDuration timeDuration = new TimeDuration();
        RandomizeData randomizeData = new RandomizeData(0,1000);
        int[] bigDataToSort = randomizeData.randomize();

        System.out.println("--- SMALL DATA SORT ---");
        int[] listToSort = {34, 13, 76, 1, 97, 61, 6, 93, 12, 32, 11, 88, 31, 84, 16, 19, 2, 66, 33, 82, 5, 43, 14, 101, 124, 4, 9, 20, 10, 99, 77};
        System.out.println("List to sort list: ");
        printArray(listToSort);

        long startTimeBubbleSort = System.nanoTime();
        int[] bubbleSorted = bubbleSort.bubbleSort(listToSort);
        long endTimeBubbleSort = System.nanoTime();
        System.out.println("Sorted list by using \" bubble sort\": ");
        printArray(bubbleSorted);

        long startTimeInsertSort = System.nanoTime();
        int[] insertSorted = insertSort.insertSort(listToSort);
        long endTimeInsertSort = System.nanoTime();
        System.out.println("Sorted list by using \" insert sort\": ");
        printArray(insertSorted);

        long startTimeQuickSort = System.nanoTime();
        int[] quickSorted = quickSort.quickSort(listToSort, 0,listToSort.length-1);
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
        System.out.println("--- END SMALL DATA SORT ---");

        System.out.println("--- BIG DATA SORT ---");
        System.out.println("List to sort list: ");
        printArray(bigDataToSort);

        startTimeBubbleSort = System.nanoTime();
        int[] bubbleSorted2 = bubbleSort.bubbleSort(bigDataToSort);
        endTimeBubbleSort = System.nanoTime();
        System.out.println("Sorted list by using \" bubble sort\": ");
        printArray(bubbleSorted2);

        startTimeInsertSort = System.nanoTime();
        int[] insertSorted2 = insertSort.insertSort(bigDataToSort);
        endTimeInsertSort = System.nanoTime();
        System.out.println("Sorted list by using \" insert sort\": ");
        printArray(insertSorted2);

        startTimeQuickSort = System.nanoTime();
        int[] quickSorted2 = quickSort.quickSort(bigDataToSort, 0,bigDataToSort.length-1);
        endTimeQuickSort = System.nanoTime();
        System.out.println("Sorted list by using \" quick sort\": ");
        printArray(quickSorted2);

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
