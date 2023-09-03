import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Homework4.1");

        int digit;
        for (int i = 0; i <= 9; i++) {
            digit = (int) Math.pow(2, (double) i);
            System.out.print(" " + digit);
        }

        System.out.println();
        System.out.println();
        System.out.println("Homework4.2");

        Random random = new Random();
        digit = random.nextInt(0, 2_147_483_647);
        System.out.println("Didit: " + digit);

        int digitSum = 0;
        int digitMulti = 1;
        int digitBuffer;

        while (digit != 0) {
            digitBuffer = digit % 10;
            digitSum += digitBuffer;
            digitMulti *= digitBuffer;
            digit /= 10;
        }

        System.out.println("Сумма: " + digitSum);
        System.out.println("Произведение: " + digitMulti);

        System.out.println();
        System.out.println("Homework4.3");

        digit = random.nextInt(0, 2_147_483_647);
        System.out.println("Didit: " + digit);

        int digitMax = digit % 10;
        int index = 0;
        int j = 1;

        while (digit != 0) {
            digitBuffer = digit % 10;
            if (digitMax < digitBuffer) {
                digitMax = digitBuffer;
                index = j;

            }
            digit /= 10;
            j++;
        }

        System.out.println("Max: " + digitMax + " Индекс: " + index);

        System.out.println();
        System.out.println("Homework4.4");

        digit = random.nextInt(1, 10);
        int factorial = 1;
        for (int k = 1; k <= digit; k++) {
            factorial *= k;
        }

        System.out.println("Didit: " + digit);
        System.out.println("Factorial: " + factorial);

        System.out.println();
        System.out.println("Homework4.5");

        int digitFirst = 0;
        int digitSecond;
        digit = 1;

        System.out.printf("%3s", digitFirst);

        while (digit <= 34) {
            System.out.printf("%3s", digit);
            digitSecond = digit;
            digit = digit + digitFirst;
            digitFirst = digitSecond;
        }

        System.out.println();
        System.out.println();
        System.out.println("Homework4.6");

        int quantity = 0;

        for (int i = 1; i <= 99999; i++) {

            digit = i;

            while (digit != 0) {

                if (digit % 10 == 4) {
                    quantity++;
                    break;
                }

                if (digit % 100 == 13) {
                    quantity++;
                    break;
                }
                digit /= 10;
            }
        }

        System.out.println("Нужно исключить: " + quantity);

        System.out.println();
        System.out.println("Homework4.7");

        digitFirst = 0;
        digitSecond = 0;
        int digitSumFirst = 0;
        int digitSumSecond = 0;

        quantity = 0;

        for (int i = 1; i < 1000; i++) {
            digitFirst = i;
            digitSumFirst = 0;

            while (digitFirst != 0) {
                digitBuffer = digitFirst % 10;
                digitSumFirst += digitBuffer;
                digitFirst /= 10;
            }

            for (int k = 1; k < 1000; k++) {
                digitSecond = k;
                digitSumSecond = 0;

                while (digitSecond != 0) {
                    digitBuffer = digitSecond % 10;
                    digitSumSecond += digitBuffer;
                    digitSecond /= 10;
                }

                if (digitSumFirst == digitSumSecond) {
                    quantity++;
                }
            }
        }
        System.out.println("Счастливых билетов: " + quantity);

        System.out.println();
        System.out.println("Homework4.8");

        quantity = 0;

        for (int i = 1; i <= 50000; i++) {

            digit = i;

            while (digit != 0) {

                if (digit % 10 == 2) {
                    quantity++;
                    break;
                }

                digit /= 10;
            }
        }

        System.out.println("Нужно исправить: " + quantity);

        System.out.println();
        System.out.println("Homework4.9");

        boolean digitStay = true;
        digit = random.nextInt(2, 100);
        System.out.println("Didit: " + digit);

        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                digitStay = false;
            }
        }
        if (digitStay) {
            System.out.println("Является простым");
        }

        System.out.println();
        System.out.println("Homework4.10");

        quantity = 0;
        int secondDigitHours = 0;

        for (int firstDigitHours = 0; firstDigitHours <= 2; firstDigitHours++) {

            if (firstDigitHours < 2) {
                secondDigitHours = 5;
            } else {
                secondDigitHours = 3;
            }

            while (secondDigitHours >= 0) {
                quantity++;
                secondDigitHours--;
            }
        }
        System.out.println("Количество зеркальных цифр часов: " + quantity);
    }
}
