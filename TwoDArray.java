port java.util.*;

public class SelectionSortUI
{
public static void main(String args[])
{
	int[] array = {23, 65, 12, 18, 42};
	System.out.println( "Original Array:" + Arrays.toString(array) );

	for(int i=0; i<array.length; i++)  
    {  
        for(int j=i+1; j<array.length; j++)  
        {  
            if(array[i] > array[j])  
            {  
                int temp = array[i];  
                array[i] = array[j];  
                array[j] = temp;  
            }  
        }  
    }  
	System.out.println("Sorted Array" + Arrays.toString(array));
}
}
