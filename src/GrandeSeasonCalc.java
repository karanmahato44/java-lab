/* 

# int div
0 / 10    0
10 / 10   1
20 / 10   2
30 / 10   3
40 / 10   4
50 / 10   5
60 / 10   6
70 / 10   7
80 / 10   8
90 / 10   9
100 / 10  10
57 / 10   5


# gurubaa.com
≥90	        A+	
≥80 && <90	A	
≥70 && <80	B+	
≥60 && <70	B	
≥50 && <60	C+	
≥40 && <50	C	
≥35 && <40	D
<35	        NG

*/

import java.util.Scanner;

class GrandeSeasonCalc {
    public static void main(String[] args) {
        gradeFinder();
        seasonFinder();
    }

    public static void gradeFinder() {
        System.out.println("\n#### Grade Finder ####\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        switch(marks / 10) {
            case 9, 10:
                if (marks <= 100)
                    System.out.println("Your Grade is: A+");
                else
                    System.out.println("Not Graded");
                break;

            case 8:
                System.out.println("Your Grade is: A");
                break;

            case 7:
                System.out.println("Your Grade is: B+");
                break;

            case 6:
                System.out.println("Your Grade is: B");
                break;

            case 5:
                System.out.println("Your Grade is: C+");
                break;

            case 4:
                System.out.println("Your Grade is: C");
                break;

            case 3:
                if (marks >= 35)
                    System.out.println("Your Grade is: D");
                else
                    System.out.println("Not Graded");
                break;

            default:
                System.out.println("Not Graded");
        }
    }

    public static void seasonFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n#### Season Finder ####\n");
        System.out.print("Enter month(1-12)(Jan-Dec): ");

        int month = scanner.nextInt();
        scanner.close();

        switch(month) {
            case 1, 2, 12:
                System.out.println("It's Winter.");
                break;

            case 3, 4, 5:
                System.out.println("It's Spring.");
                break;

            case 6, 7, 8:
                System.out.println("It's Summer.");
                break;

            case 9, 10, 11:
                System.out.println("It's Autumn.");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
