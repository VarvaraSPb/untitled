public class LessonSecond {

    public static void main(String args[]) {

        //  change();
        //  plusThree();
        //  multiply();
        makeTable();
    }

    public static void change() {

        int[] arr = {1, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
                System.out.println(arr[i]);
            }
            System.out.println(arr[i]);
        }
    }

    public static void plusThree() {
        int[] arr = new int[8];
        arr[0] = 0;
        System.out.println(arr[0]);
        for (int m = 1; m < arr.length; m++) {
            arr[m] = arr[m - 1] + 3;
            System.out.println(arr[m]);
        }
    }

    public static void multiply() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] < 6) {
                arr[m] = arr[m] * 2;
            } else {
                arr[m] = arr[m];
            }
            System.out.println(arr[m]);
        }
    }

    public static void makeTable() {
        int[][] table = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
                if ((i + j) == 10) {
                    table[i][j] = 1;
                }
                if (table[i][j] != 1) {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

}
