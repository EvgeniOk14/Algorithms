package BinaryHeap;

public class BinaryHeap
{
    public void heapify(int[] array, int heapSize, int parentRootIndex)
    {
        int largestIndexElement = parentRootIndex;
        int leftChildIndex = 2 * parentRootIndex + 1;
        int rightChildIndex = 2 * parentRootIndex + 2;

        if (leftChildIndex < heapSize && array[leftChildIndex] > array[largestIndexElement])
        {
            largestIndexElement = leftChildIndex;
        }
        if (rightChildIndex < heapSize && array[rightChildIndex] > array[largestIndexElement])
        {
            largestIndexElement = rightChildIndex;
        }
        if (largestIndexElement != parentRootIndex)
        {
            int temp = array[parentRootIndex];
            array[parentRootIndex] = array[largestIndexElement];
            array[largestIndexElement] = temp;
            heapify(array, heapSize, largestIndexElement);
        }
    }

    public int[] heapSort(int[] array)
    {
        for(int i = array.length / 2 - 1; i >= 0; i--)
        {
            heapify(array, array.length, i);
        }
        for(int i = array.length - 1; i >= 0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        return array;
    }

}
