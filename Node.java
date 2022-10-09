/**
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
//@Author : Sanat04


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        int t = sc.nextInt();
        //int t=1;
        while (t-- > 0) {
           String str= sc.next();
           char[] ch=str.toCharArray();
           Arrays.sort(ch);
           res.append(ch).append("\n");
        }
        System.out.println(res);
    }
}
