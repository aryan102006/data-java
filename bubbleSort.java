import java.util.Arrays;
import java.util.Scanner;
public class BubbleSortUI 
{
    public static void main(String[] args) 
    {
	   int i, j;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of array : \n");
        int n = sc.nextInt();

        int array[] = new int[n]; 
        System.out.print("Enter the elements that need to be inserted in the array : \n");
        
        for(i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.print("array before Sorting: \n"+ Arrays.toString(array));
        System.out.print("\nSorting begins here..\n");

        for(i=0; i<array.length; i++)
        {
            for(j=1; j<array.length-i; j++)
            {
                if(array[j-1] > array[j])
                {
                    int temp = array[j]; 
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.print("Array after Sorting is :\n");                                 
        for(i=0; i<n; i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
}
