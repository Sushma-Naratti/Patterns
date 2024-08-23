
public class patterns {

      public static void main(String[] args) {

            // 1.solid rectangle
            System.out.println("solid rectangle");
            for (int i = 1; i <= 4; i++) {
                  for (int j = 1; j <= 5; j++) {
                        System.out.print("* ");
                  }
                  System.out.println();
            }

            // 2.hallow rectangle

            System.out.println("hallow rectangle");

            for (int i = 1; i <= 4; i++) {
                  for (int j = 1; j <= 5; j++) {
                        if (i == 1 || j == 1 || i == 4 || j == 4) {
                              System.out.print("* ");
                        } else {
                              System.out.print("   ");
                        }
                  }
                  System.out.println();
            }

            // 3.half left pyramid
            System.out.println("half left pyramid");
            for (int i = 1; i <= 4; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }

            // 4.half left pyramid
            System.out.println("inverted half left pyramid");
            for (int i = 4; i >= 1; i--) {
                  for (int j = i; j >= 1; j--) {
                        System.out.print("*");
                  }
                  System.out.println();
            }

            // 5.right pyramid
            int n = 4;
            System.out.println("right pyramid");
            for (int i = 1; i <= n; i++) {
                  for (int k = 1; k <= n - i; k++) {
                        System.out.print(" ");
                  }
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }

            // 6.left number patterns
            System.out.println("number left pyramid");
            for (int i = 1; i <= 5; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                  }
                  System.out.println();
            }

            // 7.inverted left number pyramid
            int n1 = 5;
            System.out.println("inverted left number pyramid");
            for (int i = n1; i >= 1; i--) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                  }
                  System.out.println();
            }

            // 8.left numbers
            System.out.println("left number counting..");
            int count = 1;
            for (int i = 1; i <= 5; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(count + " ");
                        count++;
                  }
                  System.out.println();
            }

            // 9.printing 0 and 1 patterns in left pyramid
            System.out.println("printing 0 and 1 patterns in left pyramid");
            int binary = 1;
            for (int i = 1; i <= 5; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(binary + " ");
                        if (binary == 1) {
                              binary = 0;
                        } else {
                              binary = 1;
                        }
                  }
                  System.out.println();
            }

            // 10.butterfly pattern
            System.out.println("butterfly pattern");
            for (int i = 1; i <= 4; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                  }
                  for (int k = 1; k <= 2 * (4 - i); k++) {
                        System.out.print("  ");
                  }
                  for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                  }
                  System.out.println();
            }
            // 11.carbon copy of upper part of butterfly
            for (int i = 4; i >= 1; i--) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                  }
                  for (int k = 1; k <= 2 * (4 - i); k++) {
                        System.out.print("  ");
                  }
                  for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                  }
                  System.out.println();
            }

            // 12.solid rhombus
            int rhombus = 5;
            System.out.println("solid rhombus");
            for (int i = 1; i <= rhombus; i++) {
                  for (int j = 1; j <= rhombus - i; j++) {
                        System.out.print("  ");
                  }
                  for (int k = 1; k <= rhombus; k++) {
                        System.out.print("* ");
                  }
                  System.out.println();
            }

            // 13.printing number pattern in a different manner
            System.out.println("printing number pattern in a different manner");
            for (int i = 1; i <= n1; i++) {
                  // for spaces
                  for (int k = 1; k <= n1 - i; k++) {
                        System.out.print(" ");
                  }
                  for (int j = 1; j <= i; j++) {
                        System.out.print(i + " ");
                  }
                  System.out.println();
            }

            // palindromic pattern
            System.out.println("palindromic pattern");
            for (int i = 1; i <= n1; i++) {
                  for (int k = 1; k <= n1 - i; k++) {
                        System.out.print("  ");
                  }
                  for (int j = i; j > 1; j--) {
                        System.out.print(j + " ");
                  }
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                  }
                  System.out.println();
            }

            // 15.diamond pattern'
            System.out.println("diamond pattern");
            for (int i = 1; i <= n1; i++) {
                  // spaces
                  for (int k = 1; k <= n1 - i; k++) {
                        System.out.print(" ");
                  }
                  for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
            // copy upper part of diamond
            for (int i = n1; i >= 1; i--) {
                  // spaces
                  for (int k = 1; k <= n1 - i; k++) {
                        System.out.print(" ");
                  }
                  for (int j = 1; j <= 2 * i - 1; j++) {

                        System.out.print("*");
                  }
                  System.out.println();
            }
      }
}
