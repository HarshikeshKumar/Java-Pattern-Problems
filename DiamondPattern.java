// 14. Problem --> Diamond Pattern
//    *
//   ***
//  *****
// *******    
// *******
//  *****
//   ***
//    *
public class DiamondPattern {
  public static void main(String[] args) {
    int n = 4;
    // UPPER HALF
    for (int i = 1; i <= n; i++) {
      // Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // 1st half star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // 2nd half star
      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // LOWER HALF
    for (int i = n; i >= 1; i--) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
