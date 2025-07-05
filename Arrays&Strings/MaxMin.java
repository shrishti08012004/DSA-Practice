import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        int size = sc.nextInt();  
        int numbers[] = new int[size];  // Step 2: Create array

        // Step 3: Take array input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();  
        }

        // You had max = Integer.MAX_VALUE and min = Integer.MIN_VALUE.
   
        int max = Integer.MIN_VALUE;  // Start with the lowest possible value
        int min = Integer.MAX_VALUE;  // Start with the highest possible value

        // Step 4: Traverse the array to find min and max
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];  // Update min if a smaller value is found
            }
            if (numbers[i] > max) {
                max = numbers[i];  // Update max if a larger value is found
            }
        }

        // Step 5: Print result
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}
