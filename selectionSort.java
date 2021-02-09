import java.util.*;

public class SelectionSortExample {
    public static void main(String args[]) {

        int n, i, j, tempvar;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of array : \n");
        n = sc.nextInt();

        int array[] = new int[n]; 
        System.out.print("Enter the elements that need to be inserted in the array : \n");
        
        for(i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("array before Sorting: \n"+ Arrays.toString(array));
        System.out.print("\nSorting begins here..\n");

        for(i=0; i<n; i++) {
            for(j=i+1; j<n; j++) {
                if(array[i] > array[j]) {
                    tempvar = array[i];
                    array[i] = array[j];
                    array[j] = tempvar;
                }
            }
        }
        System.out.print("Array after Sorting is :\n");

        for(i=0; i<n; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
