import student.StudentPayment;
import student.StudentCETData;
import library.LabFine;
import java.util.Scanner;

public class Erp_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        StudentPayment[] students = new StudentPayment[n];
        StudentCETData[] cetDataArr = new StudentCETData[n];

        int[] marksArray = new int[n];
        int totalQualified = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter CET number: ");
            String cetNo = sc.nextLine();

            System.out.print("Enter CET marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students[i] = new StudentPayment(name, cetNo);
            cetDataArr[i] = new StudentCETData();
            marksArray[i] = marks;
        }

        for (int i = 0; i < n; i++) {
            students[i].studentCETPayment();
            int qualified = cetDataArr[i].cetConduct(marksArray[i]);

            if (qualified == 1) {
                System.out.println(students[i].studentAdmissionDetails());
                System.out.println("Thanks! You have qualified for admission.");
            }
            totalQualified += qualified;
        }

        System.out.println("Total students qualified for admission: " + totalQualified);

        LabFine fine = new LabFine();

        System.out.print("Enter issue day (1-30): ");
        int issueDay = sc.nextInt();

        System.out.print("Enter return day (1-30): ");
        int returnDay = sc.nextInt();

        System.out.print("Enter per day fine amount: ");
        int perDayFine = sc.nextInt();

        fine.fine(issueDay, returnDay, perDayFine);
    }
}
