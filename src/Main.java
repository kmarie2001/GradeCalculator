// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userGrade = new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator." +
                " Please enter your current numeric grade.");
        double currentGrade = Double.parseDouble(userGrade.nextLine());


        if (92 <= currentGrade) {
        System.out.println("Your grade is an A");
        }
        else if (89 <= currentGrade) {
        System.out.println("Your grade is an A-");
        }
        else if (87 <= currentGrade) {
        System.out.println("Your grade is a B+");
        }
        else if (82 <= currentGrade) {
        System.out.println("Your grade is a B");
        }
        else if (79 <= currentGrade) {
        System.out.println("Your grade is a B-");
        }
        else if (77 <= currentGrade) {
        System.out.println("Your grade is a C+");
        }
        else if (72 <= currentGrade) {
        System.out.println("Your grade is a C");
        }
        else if (69 <= currentGrade) {
        System.out.println("Your grade is a C-");
        }
        else if (67 <= currentGrade) {
        System.out.println("Your grade is a D+");
        }
        else if (60 <= currentGrade) {
        System.out.println("Your grade is a D");
        }
        else if (0 <= currentGrade) {
        System.out.println("Your grade is a F");
        }
        else if (currentGrade <= 0) {
        System.out.println ("ERROR. You better be joking about that grade.");
        }

    }}