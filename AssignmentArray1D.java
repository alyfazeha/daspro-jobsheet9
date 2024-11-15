import java.util.Scanner;

public class AssignmentArray1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int total = 0;

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter the array element " + i + " : ");
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        int highestNumber = numbers[0];
        int lowestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
            if (numbers[i] < lowestNumber) {
                lowestNumber = numbers[i];
            }
        }
        
        System.out.println("highest number is : " + highestNumber);
        System.out.println("lowest number is : " + lowestNumber);
        
        double average = total / numbers.length;
        System.out.println("average is : " + average);
    }
}
