// 10. Problems --> BUTTERFLY PATTERN
// *     *
// **   **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      * 

public class ButterflyPattern {

  public static void main(String[] args) {
    int n = 4;
    // Upper HAlf
    for (int i = 1; i <= n; i++) {
      // Print First part Star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // SPACES
      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // Print Second Part Star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // Print New Line
      System.out.println();
    }

    // LOWER HALF
    for (int i = n; i >= 1; i--) {
      // First part Star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // SPACES
      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      // Second part star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}