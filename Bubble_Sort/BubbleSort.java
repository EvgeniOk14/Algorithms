package Bubble_Sort;

public class BubbleSort
{
    public int[] bubbleSort(int[] array)
    {
        int length = array.length - 1;
        for(int i = 0; i < array.length -1; i++)
        {
            for (int j = 0; j < length; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            length--;
        }
        return array;
    }
}
