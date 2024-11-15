import java.util.Scanner;

public class ArrayAverageScore05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPassed = 0, totalFailed = 0;
        double averagePassed = 0, averageFailed = 0;
        double counterPassed = 0, counterFailed = 0;
        
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < score.length; i++){
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++){
            if (score[i] > 70) {
                counterPassed++;
                totalPassed += score[i];
                averagePassed = totalPassed / counterPassed;
            } else {

                counterFailed++;
                totalFailed += score[i];
                averageFailed = totalFailed / counterFailed;
            }
        }

        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is " + averageFailed);
        // average = total / score.length;
        // System.out.println("The class average score is " + average);

        // System.out.println("Total student who has passed the test : " + counter);
    }
}
