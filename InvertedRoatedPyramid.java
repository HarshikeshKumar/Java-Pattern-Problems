// 4. Problems -->
//      *
//    * *
//  * * *
//* * * *
public class InvertedRoatedPyramid {
  public static void main(String[] args) {
    int n = 4;
    // Outer Loop
    for (int i = 1; i <= n; i++) {
      // Inner Loop --> SPACE PRINT
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Inner Loop --> STAR PRINT
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
