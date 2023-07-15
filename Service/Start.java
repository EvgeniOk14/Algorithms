package Service;

import BinaryHeap.BinaryHeap;
import Bubble_Sort.BubbleSort;
import quickSort.QuickSort;

public class Start
{
    public void start()
    {
        int[] array = new int[10];
        RandomizeArray randomizeArray = new RandomizeArray();
        PrintArray printArray = new PrintArray();
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayRandom = randomizeArray.randomizeArray(array);

        System.out.println("RandonArray : ");
        printArray.PrintArray(arrayRandom);
        System.out.println(" ");

        long bubbleSort1 = System.nanoTime();
        int[] arrayBubbleSort = bubbleSort.bubbleSort(arrayRandom);
        long bubbleSort2 = System.nanoTime();

        System.out.println("BubbleSortArray: ");
        printArray.PrintArray(arrayBubbleSort);
        System.out.println("bubbleSort Time: " + (bubbleSort2- bubbleSort1));
        System.out.println(" ");


        QuickSort quickSort = new QuickSort();
        long quickSort1 = System.nanoTime();
        int[] arrayQuicksort = quickSort.quickSort(arrayRandom,0, arrayRandom.length -1);
        long quickSort2 = System.nanoTime();

        System.out.println("quickSortArray: ");
        printArray.PrintArray(arrayQuicksort);
        System.out.println("quickSort Time: " + (quickSort2- quickSort1));
        System.out.println(" ");


        BinaryHeap binaryHeap = new BinaryHeap();
        long binaryHeapSort1 = System.nanoTime();
        int[] arrayBinaryHeapSort =  binaryHeap.heapSort(arrayRandom);
        long binaryHeapSort2 = System.nanoTime();

        System.out.println("BinaryHeapSortArray: ");
        printArray.PrintArray(arrayBinaryHeapSort);
        System.out.println("binaryHeapSort Time: " + (binaryHeapSort2 - binaryHeapSort1));
    }
}
