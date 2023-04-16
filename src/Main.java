import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");

        int[] integer = {1, 2, 3};
        for (int index = 0; index < integer.length; index++) {
            if (index == integer.length - 1) {
                System.out.println(integer[index]);
            } else
                System.out.print(integer[index] + ", ");
        }
        int[] twoOption = {1, 2, 3};
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(twoOption[index]);
            } else
                System.out.print(twoOption[index] + ", ");
        }
    }


    public static void task2() {
        System.out.println("Задание 2");

        float[] numbers = {1.57f, 7.654f, 9.986f};
        for (int index = 0; index < numbers.length; index++) {
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
            } else
                System.out.print(numbers[index] + ", ");
        }
        float[] numbersTwo = {1.57f, 7.654f, 9.986f};
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(numbersTwo[index]);
            } else
                System.out.print(numbersTwo[index] + ", ");

        }
    }


    public static void task3() {
        System.out.println("Задание 3");

        double[] anyArray = new double[3];
        anyArray[0] = 8.12345678;
        anyArray[1] = 111.002;
        anyArray[2] = 90.0118883;

        for (int index = 0; index < anyArray.length; index++) {
            if (index == anyArray.length - 1) {
                System.out.println(anyArray[index]);
            } else
                System.out.print(anyArray[index] + ", ");
        }
        double[] anyArray1 = new double[3];
        anyArray1[0] = 8.12345678;
        anyArray1[1] = 111.002;
        anyArray1[2] = 90.0118883;

        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(anyArray1[index]);
            } else
                System.out.print(anyArray[index] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        int[] integer = {1, 2, 3};
        for (int index = 0; index < integer.length; index++) {
            if (integer[index] % 2 != 0) integer[index]++;
        }
        System.out.println(Arrays.toString(integer));
    }
}














