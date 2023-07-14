package Bubble_Sort;

import java.sql.SQLOutput;
import java.util.Random;

public class RandomizeArray
{
//    private int[] array;
//    public RandomizeArray(int[] array)
//    {
//        this.array = array;
//    }

    public int[] randomizeArray(int[] array)
    {

        for(int i = 0; i < array.length; i++)
        {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
}
