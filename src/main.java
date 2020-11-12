import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        switch (a) {
            case 1:
                if (b < 32 && b > 0) System.out.println(365 - b);
                else System.out.println(-1);
                break;
            case 3:
                if (b < 32 && b > 0) System.out.println(306 - b);
                else System.out.println(-1);
                break;
            case 5:
                if (b < 32 && b > 0) System.out.println(245 - b);
                else System.out.println(-1);
                break;
            case 7:
                if (b < 32 && b > 0) System.out.println(184 - b);
                else System.out.println(-1);
                break;
            case 8:
                if (b < 32 && b > 0) System.out.println(153 - b);
                else System.out.println(-1);
                break;
            case 10:
                if (b < 32 && b > 0) System.out.println(92 - b);
                else System.out.println(-1);
                break;
            case 12:
                if (b < 32 && b > 0) System.out.print(31 - b);
                else System.out.println(-1);
                break;
            case 4:
                if (b < 31 && b > 0) System.out.println(275 - b);
                else System.out.println(-1);
                break;
            case 6:
                if (b < 31 && b > 0) System.out.println(214 - b);
                else System.out.println(-1);
                break;
            case 9:
                if (b < 31 && b > 0) System.out.println(122 - b);
                else System.out.println(-1);
                break;
            case 11:
                if (b < 31 && b > 0) System.out.print(61 - b);
                else System.out.println(-1);
                break;
            case 2:
                if (b < 29 && b > 0) System.out.print(334 - b);
                else System.out.println(-1);
                break;
            default:
                System.out.print(-1);
        }
    }
}