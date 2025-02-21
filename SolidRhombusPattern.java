// 11. Problems --> SOLID RHOMBUS

//     *****
//    *****
//   *****
//  *****
// *****

public class SolidRhombusPattern {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      // SPACES
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // STSRS
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
