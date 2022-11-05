import java.util.Random;
import java.util.Scanner;

public class LessonThird {
    static Scanner sc = new Scanner(System.in);
    static boolean isRun = true;

    public static void main(String[] args) {
        while (isRun) {
            int x = random();
            boolean isWork = false;
            int numb;
            for (int i = 0; i < 3; i++) {
                numb = imputNumber();
                isWork = writ(x, numb);
                if (isWork) {
                    break;
                }
            }
            if (!isWork) {
                System.out.println("вы не угадали, это:" + x);
            }
            System.out.println("вы хотите продолжить? введите 1, если да");
            if (sc.nextInt() != 1) {
                isRun = false;
            }
        }
        sc.close();
    }

    public static int random() {
        Random rand = new Random();
        int x = rand.nextInt(10);
        //   System.out.println(x);
        return x;
    }

    public static int imputNumber() {
        System.out.println("введите число от 0 до 9");

        int numb = sc.nextInt();

        return numb;
    }

    public static boolean writ(int x, int numb) {
        boolean isEquallyX = false;
        if (numb > x) {
            System.out.println("ваше число больше");
        }
        if (numb < x) {
            System.out.println("ваше число меньше");
        }
        if (numb == x) {
            System.out.println("ты прав");
            isEquallyX = true;
        }
        return isEquallyX;
    }

}
