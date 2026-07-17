/*
 * ==========================================================
 * Project    : Array Statistics
 * Topic      : Arrays
 * Author     : Akhila Kuchaboini
 *
 * Description:
 * A Java console application that accepts an array of
 * integers and performs common statistical operations,
 * including calculating the sum, average, largest element,
 * and smallest element, while displaying all array elements.
 * ==========================================================
 */
import java.util.Scanner;
public class ArrayStatistics
{
    public static void arrayStatistics()
    {
        System.out.println("===== ARRAY STATISTICS =====");
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0)
        {
             System.out.println("Invalid array size! Size must be greater than 0.");
             sc.close();
             return;
        }
        if (size > 1000)
        {
             System.out.println("Array size is too large! Please enter a value less than or equal to 1000.");
            sc.close();
             return;
        }
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length; i++ )
        {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("/n===== RESULT =====");
        System.out.print("Array elements : ");
        for(int a : arr)
        {
            System.out.print(a + " ");
        }
        int sum = 0;
        int largest =arr[0];
        int smallest = arr[0];
        double average = 0;
       for(int i = 0 ; i < arr.length; i++ )
        {
            sum += arr[i];
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        average = (double)sum/arr.length;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
        sc.close();
        
    }
    public static void main(String[] args)
    {
        arrayStatistics();
    }
}
