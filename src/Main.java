import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int z = -1;

        do {
            i = 0;
            try {
                z = Integer.parseInt(JOptionPane.showInputDialog(null, "Выберите задание указав цифру" +
                        "\n1) Найти два максимальных числа массива \n2) Вывести элементы массива, которые больше стоящих перед ними"));
            } catch (Exception e) {
                i = 1;
            }
        } while (i==1|(z!=1&z!=2));


        do {
            i = 0;
            try {
                if (z==1) {
                FindTwoMax(Integer.parseInt(JOptionPane.showInputDialog(null, "Введите длину массива")),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Введи максимальное число массива")));}
                else if (z==2) {
                    NextIncreasedPrevious(Integer.parseInt(JOptionPane.showInputDialog(null, "Введите длину массива")),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Введи максимальное число массива")));
                }
            } catch (Exception e) {
                i = 1;
            }
        } while (i == 1);

    }





    private static void FindTwoMax(int lenght, int max){
        int[] bigNumber = new int[lenght];
        int firstNumb = -1;
        int secondNumb = -1;
        for (int i = 0; i < lenght ;i++) {
            bigNumber[i] = new Random().nextInt(max + 1);
        }
        for (int i = 0; i < lenght ; i++) {
            if (firstNumb<=bigNumber[i]) {
                secondNumb = firstNumb;
                firstNumb = bigNumber[i];
            } else if (secondNumb <= bigNumber[i]) {
                secondNumb = bigNumber[i];
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(bigNumber) + "\n Наибольшие числа: " +
                firstNumb + " " + secondNumb);
    }

    private static void NextIncreasedPrevious(int lenght, int max) {
        String result = "\nЧисла которые больше чем предыдущие перед ними : ";
        int[] bigNumber = new int[lenght];
        for (int i = 0; i < lenght ; i++) {
            bigNumber[i] = new Random().nextInt(max+1);
        }
        for (int i = 1; i < lenght; i++) {
            if (bigNumber[i] > bigNumber[i-1]) {
                result += bigNumber[i] + "  ";
            }
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(bigNumber) + result);
    }

}
