package quickSort;

public class QuickSort
{
    public int[] quickSort(int[] array, int startPosition, int endPosition)
    {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2 ];

        while(leftPosition <= rightPosition) {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        }
            if(leftPosition < endPosition)
            {
                quickSort(array, leftPosition, endPosition);
            }
            if(startPosition < rightPosition)
            {
                quickSort(array, startPosition, rightPosition);
            }

        return array;
    }
}
