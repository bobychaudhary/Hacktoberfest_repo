/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 07-Mar-21
 *   Time: 8:49 PM
 *   File: FibUsingRecursion.java
 */

package March.mar07_21_NK;

import java.util.Scanner;

public class FibUsingRecursion {
    static int a = 0, b = 1;

    public static void fib(int n) {
        if (n > 0) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fib(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCount = sc.nextInt();
        System.out.print(a + " " + b);
        fib(numberOfCount - 2);
    }
}

