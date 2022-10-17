import java.util.*;

public class A_Linear_keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String l = sc.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if(map.containsKey(s.charAt(i))){
                    continue;
                }
                else{
                    map.put(s.charAt(i),i+1);
                }
            }
            if (l.length() == 0 || l.length() == 1) {
                System.out.println(0);
                continue;
            }
            int sum = 0;
            int bb = map.get(l.charAt(0));
            for (int i = 1; i < l.length(); i++) {
                int res = Math.abs(bb - map.get(l.charAt(i)));
                sum += res;
                bb = map.get(l.charAt(i));
            }
            System.out.println(sum);
        }
    }
}
