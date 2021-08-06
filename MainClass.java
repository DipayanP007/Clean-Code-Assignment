/*
Finding the smallest and greatest element in a given 1-D Number Array
*/

public class MainClass 
{
    /*Class to store the greatest and smallest element in the array */
    
    static class GreatestSmallestElement 
    {

        int smallerNumber;
        int greaterNumber;
    }

    /* Method to find the smallest and greatest array elemetn and return the object*/
    
    static GreatestSmallestElement findGreatestSmallestElement(int givenNumberArray[], int arrayLength)
    {
        GreatestSmallestElement gse_object = new GreatestSmallestElement();
        int arrayIndex;

        if (arrayLength == 1)
        {
            gse_object.greaterNumber = givenNumberArray[0];
            gse_object.smallerNumber = givenNumberArray[0];
            return gse_object;
        }

        if (givenNumberArray[0] > givenNumberArray[1])
        {
            gse_object.greaterNumber = givenNumberArray[0];
            gse_object.smallerNumber = givenNumberArray[1];
        }
        else
        {
            gse_object.greaterNumber = givenNumberArray[1];
            gse_object.smallerNumber = givenNumberArray[0];
        }

        for (arrayIndex = 2; arrayIndex < arrayLength; arrayIndex++)
        {
            if (givenNumberArray[arrayIndex] > gse_object.greaterNumber)
            {
                gse_object.greaterNumber = givenNumberArray[arrayIndex];
            }
            else if (givenNumberArray[arrayIndex] < gse_object.smallerNumber)
            {
                gse_object.smallerNumber = givenNumberArray[arrayIndex];
            }
        }

        return gse_object;
    }

    public static void main(String args[])
    {
        int givenNumberArray[] = {1000, 11, 445, 1, 330, 3000};
        int arrayLength = 6;
        GreatestSmallestElement gse_object = findGreatestSmallestElement(givenNumberArray, arrayLength);
        System.out.printf("\nSmallest Number in the given array is %d", gse_object.smallerNumber);
        System.out.printf("\nGreatest Number in the given array is is %d", gse_object.greaterNumber);
    }
}

