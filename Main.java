package Activity2ArrayManipulation;

public class Main {


    public static void main(String[] args) {
        
        // Initialize array
        int[] numbers = {13,27,23,30,40};
        // Print each element in a new line
        System.out.println("First element in array: "+ numbers[0]);
        System.out.println("Second element in array: "+ numbers[1]);
        System.out.println("Third element in array: "+numbers[2]);
        System.out.println("Fourth element in array: "+numbers[3]);
        System.out.println("Fifth element in array: "+numbers[4]+ "\n");
        
        // Sum all elements in an array
        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println("The sum of all the elements in the array: " + sum );
        
        // Get max value in array
        int max = Math.max(Math.max(Math.max(Math.max(numbers[0], numbers[1]), numbers[2]), numbers[3]),numbers[4]);

        // Print max value of array
        System.out.println("\nThe max value in the array is: "+ max);

    }
}
