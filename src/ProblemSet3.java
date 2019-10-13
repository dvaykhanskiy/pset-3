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

        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
        // ps.grade();         // executes Exercise 5
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
        System.out.println("\nPositive.");
      } else if (int1 < 0) {
        System.out.println("\nNegative.");
      } else {
        System.out.println("\nZero.");
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
        System.out.println("\nEven.");
      } else {
        System.out.println("\nOdd.");
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
        System.out.println("Strictly increasing.");
      } else if ((int3_2 == int3_1) && (int3_3 == int3_2)) {
        System.out.println("Same.");
      } else if ((int3_2 >= int3_1) && (int3_3 >= int3_2)) {
        System.out.println("Increasing.");
      } else if ((int3_2 < int3_1) && (int3_3 < int3_2)) {
        System.out.println("Strictly decreasing.");
      } else if ((int3_2 <= int3_1) && (int3_3 <= int3_2)) {
        System.out.println("Decreasing.");
      } else {
        System.out.println("Unordered.");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
      System.out.print("Enter a letter grade: ");
      String letterGrade = in.nextLine();
      letterGrade = letterGrade.toUpperCase();
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
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "A":
          gpaValue = A_VALUE;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "A-":
          gpaValue = A_VALUE - GPA_ADJUST;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "B+":
          gpaValue = B_VALUE + GPA_ADJUST;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "B":
          gpaValue = B_VALUE;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "B-":
          gpaValue = B_VALUE - GPA_ADJUST;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "C+":
          gpaValue = C_VALUE + GPA_ADJUST;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "C":
          gpaValue = C_VALUE;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "C-":
          gpaValue = C_VALUE - GPA_ADJUST;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "D+":
          gpaValue = D_VALUE + GPA_ADJUST;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "D":
          gpaValue = D_VALUE;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "D-":
          gpaValue = D_VALUE - GPA_ADJUST;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        case "F":
          gpaValue = F_VALUE;
          System.out.printf("Your GPA is %.2f.", gpaValue);
          break;
        default:
          System.out.println("That's not a valid letter grade.");
          break;
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      System.out.print("Enter a grade: ");
      double numberGrade = in.nextDouble();
      final double A_MAX = 100;
      final double A_MIN = 90;
      final double B_MIN = 80;
      final double C_MIN = 70;
      final double D_MIN = 60;
      final double F_MIN = 0;
      if (numberGrade >= A_MIN && numberGrade <= A_MAX) {
        System.out.println("You receive an A.");
      } else if (numberGrade >= B_MIN && numberGrade <= A_MIN) {
        System.out.println("You receive a B.");
      } else if (numberGrade >= C_MIN && numberGrade <= B_MIN) {
        System.out.println("You receive a C.");
      } else if (numberGrade >= D_MIN && numberGrade <= C_MIN) {
        System.out.println("You receive a D.");
      } else if (numberGrade >= F_MIN && numberGrade <= D_MIN) {
        System.out.println("You receive a F.");
      } else if (numberGrade > 100) {
        System.out.println("Grades above 100 are invalid.");
      } else if (numberGrade < 0) {
        System.out.println("Grades below 0 are invalid.");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      System.out.print("Enter a card: ");
      String cardName = in.nextLine();
      cardName = cardName.toUpperCase();
      String cardRank = cardName.substring(0, 1);
      String cardSuit = cardName.substring(1);

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
        System.out.println("That's not a valid rank.");
      } else if (cardSuit == "Invalid" || cardName.length() != 2) {
        System.out.println("That's not a valid suit.");
      } else {
        System.out.println(cardRank + " of " + cardSuit + ".");
      }
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("Enter a year: ");
      double year = in.nextDouble();
      if ((year % 4) == 0) {
        System.out.printf("%.0f is a leap year.\n", year);
      } else {
        System.out.printf("%.0f is not a leap year.\n", year);
      }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
