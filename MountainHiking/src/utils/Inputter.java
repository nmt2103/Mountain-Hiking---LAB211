package utils;

import java.util.Scanner;

public class Inputter {

  private Scanner sc;

  public Inputter() {
    this.sc = new Scanner(System.in);
  }

  /**
   * Get string and validate
   *
   * @param msg Message notification for user
   * @param pattern Regex pattern in Acceptable
   * @param errorMsg Error message notification for user
   * @return String data is normalized
   */
  public String getInput(String msg, String pattern, String errorMsg) {
    String data;
    while (true) {
      System.out.println(msg);
      data = sc.nextLine().trim();

      // Check validation
      if (Acceptable.isValid(data, pattern)) {
        return data;
      }

      // Print error message if data is invalid
      System.err.println(errorMsg);
    }
  }

  /**
   * Get string and parse to integer
   *
   * @param msg Message notification for user
   * @param min Minimum integer
   * @param max Maximum integer
   * @return Integer
   */
  public int getInt(String msg, int min, int max) {
    while (true) {
      try {
        System.out.println(msg);
        String data = sc.nextLine().trim();

        // Parse string to int
        int number = Integer.parseInt(data);

        // Check valid range
        if (number >= min && number <= max) {
          return number;
        }

        System.err.println("Enter a number between " + min + " and " + max);
      } catch (NumberFormatException e) {
        System.err.println("Invalid input! Enter an integer number.");
      }
    }
  }

  /**
   * Get string and parse to double
   *
   * @param msg Message notification for user
   * @param min Minimum double
   * @param max Maximum double
   * @return Double
   */
  public double getDouble(String msg, double min, double max) {
    while (true) {
      try {
        System.out.println(msg);
        String data = sc.nextLine().trim();

        // Parse string to int
        double number = Double.parseDouble(data);

        // Check valid range
        if (number >= min && number <= max) {
          return number;
        }

        System.err.println("Enter a number between " + min + " and " + max);
      } catch (NumberFormatException e) {
        System.err.println("Invalid input! Enter an integer number.");
      }
    }
  }

  /**
   * Get string
   *
   * @param msg Message notification for user
   * @return String
   */
  public String getString(String msg) {
    System.out.println(msg);
    return sc.nextLine().trim();
  }
}
