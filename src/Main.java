public class Main {

    byte aByte = 126;
    short aShort = 32760;
    static int anInt = 2147483000;
    long aLong = -9223372036854775807L;
    float aFloat = 12.23f;
    double aDouble = 12.23;
    char aChar = 'd';
    static boolean aBoolean = true;

    public static void main(String[] args) {

        System.out.println("Hello Varvara! You are cool!");
        anInt = countValue(1, 1, 1, 1);
        System.out.println("anInt = " + anInt);
        aBoolean = checkThatWithinLimit(10, 11);
        if (aBoolean) {
            System.out.println("значение лежит в заданнных пределах");
        } else {
            System.out.println("значение не верное");
        }
    }


    public static int countValue(int a, int b, int c, int d) {
        int value;
        value = a * (b + (c / d));
        return value;
    }

    //a * (b + (c / d))
    public static boolean checkThatWithinLimit(int a, int b) {
        int sum = a + b;
        if (10 < sum) {
            if (sum <= 20) {
                return true;
            }
        }
        return false;
    }
}

//Написать метод, принимающий на вход два числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.