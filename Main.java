import Bubble_Sort.BubbleSort;
import Bubble_Sort.PrintArray;
import Bubble_Sort.RandomizeArray;
import quickSort.QuickSort;

import java.util.Arrays;

public class Main
{
public static void main(String[] args) 
{
    int[] array = new int[10];

    RandomizeArray randomizeArray = new RandomizeArray();
    PrintArray printArray = new PrintArray();
    BubbleSort bubbleSort = new BubbleSort();
    int[] arrayRandom = randomizeArray.randomizeArray(array);

    printArray.PrintArray(arrayRandom);

    long bubbleSort1 = System.nanoTime();
    int[] arrayBubbleSort = bubbleSort.bubbleSort(arrayRandom);
    long bubbleSort2 = System.nanoTime();

    printArray.PrintArray(arrayBubbleSort);

    System.out.println("bubbleSort " + (bubbleSort2- bubbleSort1));



    QuickSort quickSort = new QuickSort();
    long quickSort1 = System.nanoTime();
    int[] arrayQuicksort = quickSort.quickSort(arrayRandom,0, arrayRandom.length -1);
    long quickSort2 = System.nanoTime();

    printArray.PrintArray(arrayQuicksort);
    System.out.println("quickSort " + (quickSort2- quickSort1));
}
}