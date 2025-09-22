package lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Лабораторна робота №1.
 * Lab1SterniukKI306 - клас для генерації зубчастого масиву, 
 * який містить заштриховану область квадратної матриці згідно заданого варіанту.
 */

public class Lab1SterniukKI306 {
	/**
     * Основний метод, який виконує генерацію зубчастого масиву, зчитує введені дані і зберігає результат у файл.
     * @param args аргументи командного рядка (не використовуються).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            //Введення розміру матриці
            System.out.print("Введення розмір матриці (непарне число): ");
            int n = sc.nextInt();
            sc.nextLine(); // Очистка буферу після введення числа

            // Введення символу-заповнювача
            System.out.print("Введіть символ-заповнювач: ");
            String filler = sc.nextLine();

            // Перевірка коректності введення символу
            if (filler.length() != 1) {
                System.out.println("Помилка: потрібно ввести рівно один символ!");
                return;
            }

            char ch = filler.charAt(0);

            // Формування зубчатого масиву
            char[][] jaggedArray = new char[n][];
            int mid = n / 2; // середина

            for (int i = 0; i < n; i++) {
                int length;
                if (i <= mid) {
                    length = i + 1; // зростає до середини
                } else {
                    length = n - i; // спадає після середини
                }

                jaggedArray[i] = new char[length];
                for (int j = 0; j < length; j++) {
                    jaggedArray[i][j] = ch;
                }
            }

            // Вивід у консоль
            System.out.println("\nСформований зубчатий масив:");
            for (char[] row : jaggedArray) {
                for (char c : row) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            // Запис у файл
            try (FileWriter writer = new FileWriter("result.txt")) {
                for (char[] row : jaggedArray) {
                    for (char c : row) {
                        writer.write(c + " ");
                    }
                    writer.write("\n");
                }
                System.out.println("\nМасив записано у файл result.txt");
            }

        } catch (IOException e) {
            System.out.println("Помилка роботи з файлом: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Помилка введення: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
