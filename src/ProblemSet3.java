/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("Enter an integer: ");
      int int1 = in.nextInt();

      if (int1 > 0) {
        System.out.println("\nPositive.\n");
      } else if (int1 < 0) {
        System.out.println("\nNegative.\n");
      } else {
        System.out.println("\nZero.\n");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("Enter an integer: ");
      int int2 = in.nextInt();

      if ((int2 % 2) == 0) {
        System.out.println("\nEven.\n");
      } else {
        System.out.println("\nOdd.\n");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("Enter 3 integers:\n");
      System.out.print("Enter integer: ");
      int int3_1 = in.nextInt();
      System.out.print("Enter integer: ");
      int int3_2 = in.nextInt();
      System.out.print("Enter integer: ");
      int int3_3 = in.nextInt();

      if ((int3_2 > int3_1) && (int3_3 > int3_2)) {
        System.out.println("\nStrictly increasing.\n");
      } else if ((int3_2 == int3_1) && (int3_3 == int3_2)) {
        System.out.println("\nSame.\n");
      } else if ((int3_2 >= int3_1) && (int3_3 >= int3_2)) {
        System.out.println("\nIncreasing.\n");
      } else if ((int3_2 < int3_1) && (int3_3 < int3_2)) {
        System.out.println("\nStrictly decreasing.\n");
      } else if ((int3_2 <= int3_1) && (int3_3 <= int3_2)) {
        System.out.println("\nDecreasing.\n");
      } else {
        System.out.println("\nUnordered.\n");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
      System.out.print("Enter a letter grade: ");
      in.nextLine();
      String letterGrade = in.nextLine().toUpperCase();
      final double A_VALUE = 4.0;
      final double B_VALUE = 3.0;
      final double C_VALUE = 2.0;
      final double D_VALUE = 1.0;
      final double F_VALUE = 0.0;
      double gpaValue;
      final double GPA_ADJUST = 0.33;

      switch  (letterGrade) {
        case "A+":
          gpaValue = A_VALUE;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "A":
          gpaValue = A_VALUE;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "A-":
          gpaValue = A_VALUE - GPA_ADJUST;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "B+":
          gpaValue = B_VALUE + GPA_ADJUST;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "B":
          gpaValue = B_VALUE;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "B-":
          gpaValue = B_VALUE - GPA_ADJUST;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "C+":
          gpaValue = C_VALUE + GPA_ADJUST;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "C":
          gpaValue = C_VALUE;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "C-":
          gpaValue = C_VALUE - GPA_ADJUST;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "D+":
          gpaValue = D_VALUE + GPA_ADJUST;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "D":
          gpaValue = D_VALUE;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "D-":
          gpaValue = D_VALUE - GPA_ADJUST;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        case "F":
          gpaValue = F_VALUE;
          System.out.printf("\nYour GPA is %.2f.\n", gpaValue);
          break;
        default:
          System.out.println("\nThat's not a valid letter grade.\n");
          break;
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      System.out.print("\nEnter a grade: ");
      double numberGrade = in.nextDouble();
      final double A_MAX = 100;
      final double A_MIN = 90;
      final double B_MIN = 80;
      final double C_MIN = 70;
      final double D_MIN = 60;
      final double F_MIN = 0;
      if (numberGrade >= A_MIN && numberGrade <= A_MAX) {
        System.out.println("\nYou receive an A.\n");
      } else if (numberGrade >= B_MIN && numberGrade <= A_MIN) {
        System.out.println("\nYou receive a B.\n");
      } else if (numberGrade >= C_MIN && numberGrade <= B_MIN) {
        System.out.println("\nYou receive a C.\n");
      } else if (numberGrade >= D_MIN && numberGrade <= C_MIN) {
        System.out.println("\nYou receive a D.\n");
      } else if (numberGrade >= F_MIN && numberGrade <= D_MIN) {
        System.out.println("\nYou receive a F.\n");
      } else if (numberGrade > 100) {
        System.out.println("\nGrades above 100 are invalid.\n");
      } else if (numberGrade < 0) {
        System.out.println("\nGrades below 0 are invalid.\n");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      System.out.print("Enter a card: ");
      in.nextLine();
      String cardName = in.nextLine().toUpperCase();
      String cardSuit = cardName.substring(1);
      String cardRank = cardName.substring(0, 1);

      switch (cardRank) {
        case "2":
          cardRank = "Two";
          break;
        case "3":
          cardRank = "Three";
          break;
        case "4":
          cardRank = "Four";
          break;
        case "5":
          cardRank = "Five";
          break;
        case "6":
          cardRank = "Six";
          break;
        case "7":
          cardRank = "Seven";
          break;
        case "8":
          cardRank = "Eight";
          break;
        case "9":
          cardRank = "Nine";
          break;
        case "T":
          cardRank = "Ten";
          break;
        case "J":
          cardRank = "Jack";
          break;
        case "Q":
          cardRank = "Queen";
          break;
        case "K":
          cardRank = "Kind";
          break;
        case "A":
          cardRank = "Ace";
          break;
        default:
          cardRank = "Invalid";
          break;
      }

      switch (cardSuit) {
        case "C":
          cardSuit = "Clubs";
          break;
        case "H":
          cardSuit = "Hearts";
          break;
        case "D":
          cardSuit = "Diamonds";
          break;
        case "S":
          cardSuit = "Spades";
          break;
        default:
          cardSuit = "Invalid";
          break;
      }

      if (cardRank == "Invalid") {
        System.out.println("\nThat's not a valid rank.\n");
      } else if (cardSuit == "Invalid" || cardName.length() != 2) {
        System.out.println("\nThat's not a valid suit.\n");
      } else {
        System.out.println("\n" + cardRank + " of " + cardSuit + ".");
      }
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("\nEnter a year: ");
      long year = in.nextLong();
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        System.out.println("\n" + year + " is a leap year.\n");
      } else {
        System.out.println("\n" + year + " is not a leap year.\n");
      }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      System.out.print("Enter a temperature: ");
      double temp = in.nextDouble();
      System.out.print("Enter a scale: ");
      in.nextLine();
      String scale = in.nextLine().toUpperCase();

      if (scale.equals("F") || scale.equals("f")) {
        if (temp <= 32) {
          System.out.println("\nSolid.\n");
        } else if (temp < 212) {
          System.out.println("\nLiquid.\n");
        } else {
          System.out.println("\nGas.\n");
        }
      } else if (scale.equals("C") || scale.equals("c")) {
          if (temp <= 0) {
            System.out.println("\nSolid.\n");
          } else if (temp < 100) {
            System.out.println("\nLiquid.\n");
          } else {
            System.out.println("\nGas.\n");
        }
      } else {
        System.out.println("\nThat's not a valid scale.\n");
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
      System.out.print("Enter a month: ");
        String userMonth = in.nextLine();
        userMonth = userMonth.toUpperCase();
        //28 or 29 days. 30 days. 31 days. That's not a valid month.
        switch (userMonth) {
          case "JANUARY":
          case "JANU":
          case "JAN":
            System.out.println("\n31 days.\n");
            break;
          case "FEBRUARY":
          case "FEBR":
          case "FEB":
            System.out.println("\n28 or 29 days.\n");
            break;
          case "MARCH":
          case "MARC":
          case "MAR":
            System.out.println("\n31 days.\n");
            break;
          case "APRIL":
          case "APRI":
          case "APR":
            System.out.println("\n30 days.\n");
            break;
          case "MAY":
            System.out.println("\n31 days.\n");
            break;
          case "JUNE":
          case "JUN":
            System.out.println("\n30 days.\n");
            break;
          case "JULY":
          case "JUL":
            System.out.println("\n31 days.\n");
            break;
          case "AUGUST":
          case "AUGU":
          case "AUG":
            System.out.println("\n31 days.\n");
            break;
          case "SEPTEMBER":
          case "SEPT":
          case "SEP":
            System.out.println("\n30 days.\n");
            break;
          case "OCTOBER":
          case "OCTO":
          case "OCT":
            System.out.println("\n31 days.\n");
            break;
          case "NOVEMBER":
          case "NOVE":
          case "NOV":
            System.out.println("\n30 days.\n");
            break;
          case "DECEMBER":
          case "DECE":
          case "DEC":
            System.out.println("\n31 days.\n");
            break;
          default:
            System.out.println("\nThat's not a valid month.\n");
            break;
        }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
      System.out.print("Wage: ");
      double wage = in.nextDouble();
      System.out.print("Hours: ");
      double hours = in.nextDouble();
      final double REG_HOURS = 40;
      final double OVERTIME_MULTIPLIER = 0.5;

      double salary = wage * hours;
      if (hours > REG_HOURS) {
        salary += (hours - REG_HOURS) * wage * OVERTIME_MULTIPLIER;
      }

      System.out.printf("\nYou'll make $%,.2f this week.\n\n", salary);
    }
}
