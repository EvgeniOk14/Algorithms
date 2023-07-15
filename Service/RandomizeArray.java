package Service;

import java.sql.SQLOutput;
import java.util.Random;

public class RandomizeArray
{
    public int[] randomizeArray(int[] array)
    {

        for(int i = 0; i < array.length; i++)
        {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
}
