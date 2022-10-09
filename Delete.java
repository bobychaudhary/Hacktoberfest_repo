/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
/*   Author: Sanat Kumar Dubey (sanat04)
 *   File: G.java
 */

import java.util.Scanner;

public class G {
    public static int help(int n) {
        String str = String.valueOf(n);
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int res = help(i);
            if (res % 2 != 0) count++;
        }
        System.out.println(count);
    }
}

