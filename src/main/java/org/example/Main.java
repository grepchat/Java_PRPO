package org.example;

import task1.*;
import task2.*;
import task2.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println(" ДЕМОНСТРАЦИЯ РАБОТЫ ЗАДАНИЙ (TASK 1 & TASK 2) ");
        System.out.println("=========================================\n");

        // --- ДЕМОНСТРАЦИЯ TASK 1 ---
        System.out.println("--- ПАКЕТ TASK 1 ---");

        // 1. Проверка правильности расстановки скобок (Задача 1.11)
        String validBrackets = "{[()]}";
        String invalidBrackets = "{[(])}";
        System.out.println("1. Проверка скобок:");
        System.out.println("   Строка '" + validBrackets + "' корректна? " + task1.Collections.checkBrackets(validBrackets));
        System.out.println("   Строка '" + invalidBrackets + "' корректна? " + task1.Collections.checkBrackets(invalidBrackets));

        // 2. Перестановка отрицательных и положительных элементов (Задача 1.9)
        List<Integer> listTask1 = new ArrayList<>(Arrays.asList(5, -2, 3, -1, 0, 4, -8));
        System.out.println("\n2. Перестановка элементов в списке (положительные в начале, отрицательные в конце):");
        System.out.println("   Исходный список: " + listTask1);
        task1.Collections.rearrangeList(listTask1);
        System.out.println("   Измененный список: " + listTask1);

        // 3. Сложение многочленов через HashMap (Задача 1.7)
        Map<Integer, Double> poly1 = new HashMap<>();
        poly1.put(2, 3.0); // 3x^2
        poly1.put(0, 5.0); // + 5

        Map<Integer, Double> poly2 = new HashMap<>();
        poly2.put(2, 2.0); // 2x^2
        poly2.put(1, 4.0); // + 4x

        Map<Integer, Double> polyResult = Polynomials.addPolynomials(poly1, poly2);
        System.out.println("\n3. Сложение многочленов (степень -> коэффициент):");
        System.out.println("   Результат: " + polyResult);


        // --- ДЕМОНСТРАЦИЯ TASK 2 ---
        System.out.println("\n-----------------------------------------");
        System.out.println("--- ПАКЕТ TASK 2 ---");

        // 1. Задача Иосифа Флавия (Задача 2.1)
        List<Integer> josephusList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int survivor = Collections.josephus(josephusList);
        System.out.println("1. Задача Иосифа Флавия (остался человек под номером): " + survivor);

        // 2. Поиск ближайшего числа с помощью TreeSet (Задача 2.5)
        TreeSet<Integer> numberStorage = new TreeSet<>(Arrays.asList(10, 20, 35, 50, 100));
        int target = 38;
        Integer closest = Collections.findClosest(numberStorage, target);
        System.out.println("\n2. Поиск ближайшего числа:");
        System.out.println("   Доступные числа в хранилище: " + numberStorage);
        System.out.println("   Ближайшее число к " + target + " -> " + closest);

        // 3. Моделирование работы N-местной автостоянки (Задача 2.6)
        System.out.println("\n3. Моделирование работы автостоянки на 4 места:");
        Matrices.Parking parking = new Matrices.Parking(4);

        int spot1 = parking.arrive(1); // Машина пытается встать на 1-е место
        int spot2 = parking.arrive(1); // Следующая машина тоже хочет на 1-е (должна сместиться вправо)
        System.out.println("   Машина 1 припаркована на место: " + spot1);
        System.out.println("   Машина 2 припаркована на место: " + spot2);

        parking.leave(spot1); // Первая машина уезжает
        System.out.println("   Машина с места " + spot1 + " уехала.");

        int spot3 = parking.arrive(0); // Новая машина занимает свободное
        System.out.println("   Машина 3 припаркована на место: " + spot3);

        System.out.println("\n=========================================");
        System.out.println(" ВСЕ ДЕМОНСТРАЦИИ УСПЕШНО ЗАВЕРШЕНЫ ");
        System.out.println("=========================================");
    }
}