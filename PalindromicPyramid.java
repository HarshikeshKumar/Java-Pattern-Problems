// 13. Problem -> Palindromic Pyramid Pattern
//     1
//    212
//   32123
//  4321234
// 543212345

public class PalindromicPyramid {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      // Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // 1st Half numbers
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      // 2nd Half Number
      for (int j = 2; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
