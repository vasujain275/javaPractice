package Q2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> studentsGrades = new HashMap<>();
        boolean contd = true;

        Scanner sc = new Scanner(System.in);

        while (contd) {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Add a new Record");
            System.out.println("2. Remove a Record");
            System.out.println("3. Modify a Record");
            System.out.println("4. Exit");

            int opt = sc.nextInt();
            sc.nextLine(); // Consume the newline left over
            String name, grade;

            switch (opt) {
                case 1:
                    System.out.println("Enter the Name of Student:");
                    name = sc.nextLine();
                    System.out.println("Enter the Grade of Student:");
                    grade = sc.nextLine();
                    studentsGrades.put(name, grade);
                    System.out.println("Added the Record");
                    System.out.println(studentsGrades);
                    break;

                case 2:
                    System.out.println("Enter the Name of Student:");
                    name = sc.nextLine();
                    studentsGrades.remove(name);
                    System.out.println("Removed the Record");
                    System.out.println(studentsGrades);
                    break;

                case 3:
                    System.out.println("Enter the Name of Student:");
                    name = sc.nextLine();
                    System.out.println("Enter the new Grade:");
                    grade = sc.nextLine();
                    if (studentsGrades.containsKey(name)) {
                        studentsGrades.put(name, grade);
                        System.out.println("Modified the Record");
                    } else {
                        System.out.println("404, not found");
                    }
                    System.out.println(studentsGrades);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    contd = false; // To exit the loop
                    break;

                default:
                    System.out.println("Invalid Input, Please select from 1-4");
            }
        }

        sc.close();
    }
}
